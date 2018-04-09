package blackJack2;

import java.util.Scanner;
import static blackJack2.Message.*;
// 분석결과	: 어차피 게이머가 카드를 모두 받고 나서 딜러 차례가 되는 식으로 진행되므로 게이머가 카드를 받을 때마다 Burst가 되는지 일일이 체크할 필요는 없을듯.
// 분석결과2	: 딜러는 17점 이상이면 받을 수 없음!
public class Main{
	private static final int INIT_RECEIVE_CARD_COUNT	= 2;	// 클래스(메인제외)에서는 생성자보다 여기가 먼저 실행됨
	private static final int DEALER_BURST				= 1;	// static 빼고 메인메서드 안에 넣는것도 괜찮..
	private static final int DEALER_PANELTY_DRAW		=-1;
	private static final int DEALER_COMMON_STATE		= 0;

	public static void main(String args[]){		
		Deck all_card	= new Deck();		
		Dealer D		= new Dealer();
		Gamer G			= new Gamer();
		Rule rules		= new Rule(D,G);
		Scanner sc		= new Scanner(System.in);

		System.out.println(BEGIN_MSG);
		for(int i=0;i<INIT_RECEIVE_CARD_COUNT;i++) {
			D.Draw(all_card);
			G.Draw(all_card);
		}
		D.check_the_card();
		G.check_the_card();
		
		String select ="n";
		boolean playerBurst=false;
		byte DealerState=0;
		
		while(true) {	// Gamer
			System.out.print(DRAW_INTENTION_MSG);
			select = sc.next();
			if(select.equals("y") ||select.equals("Y")) {
				G.Draw(all_card);
				G.check_the_card();
				playerBurst=rules.Gamer_burst_Check();//////// 21 넘는지만 체크. 넘으면 변수값이 참이 됨
				if(playerBurst) {/// 참이면 넘친 것
					break;
				}
			}else if(select.equals("n")|| select.equals("N")){
				break;
			}else {
				System.out.println(WRONG_INPUT_MSG);
				continue;
			}
		}
		
		while(playerBurst!=true) {
			DealerState = rules.Dealer_burst_Check();
			if(DealerState==DEALER_BURST) {
				System.out.println(DEALER_BURST_MSG);
				break;
			}else if(DealerState==DEALER_PANELTY_DRAW) {//딜러는 16점 이하면서 가진 패가 2장이하일 때 1번 더 드로우한다.
				System.out.println(DEALER_RULE_MSG);
				D.Draw(all_card);
			}else if(DealerState==DEALER_COMMON_STATE) {
				System.out.print(DRAW_INTENTION_DEALER_MSG);
				select = sc.next();
				if(select.equals("y") || select.equals("Y")) {
					D.Draw(all_card);
				}else if(select.equals("n") || select.equals("N")){
					break;
				}else {
					System.out.println(WRONG_INPUT_MSG);
					continue;
				}
			}
			D.check_the_card();
		}
		rules.WhoIsWin(playerBurst,DealerState);
	}
}