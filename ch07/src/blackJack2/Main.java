package blackJack2;

import java.util.Scanner;
import static blackJack2.Message.*;

public class Main{
	private static int INIT_RECEIVE_CARD_COUNT	=2;
	private static int DEALER_BURST				=1;
	private static int DEALER_PANELTY_DRAW		=-1;
	private static int DEALER_COMMON_STATE		=0;
	
	public static void main(String args[]){		
		Deck all_card = new Deck();		
		Dealer D = new Dealer();
		Gamer G = new Gamer();
		Rule rules = new Rule(D,G);
		Scanner sc = new Scanner(System.in);
		
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