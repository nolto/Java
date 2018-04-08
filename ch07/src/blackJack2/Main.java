package blackJack2;

import java.util.Scanner;
import static blackJack2.Message.*;

public class Main{
	public static void main(String args[]){
		Deck all_card = new Deck();		
		Dealer D = new Dealer();
		Gamer G = new Gamer();
		Rule rules = new Rule(D,G);
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			D.Draw(all_card);
			G.Draw(all_card);
		}
		D.check_the_card();
		G.check_the_card();
		
		String select ="n";
		boolean playerBurst=false;
		boolean DealerBurst=false;
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
		int mode;
		while(playerBurst!=true) {
			mode = rules.Dealer_burst_Check();
			if(mode==1) {
				DealerBurst=true;
				break;
			}else if(mode==-1) {
				System.out.println(DEALER_RULE_MSG);
				D.Draw(all_card);
			}else if(mode==0) {
				System.out.print(DRAW_INTENTION_DEALER_MSG);
				select = sc.next();
				if(select.equals("y") || select.equals("Y")) {
					D.Draw(all_card);
					if(rules.Dealer_burst_Check()==1) {
						DealerBurst=true;
						break;
					}
				}else if(select.equals("n") || select.equals("N")){
					break;
				}else {
					System.out.println(WRONG_INPUT_MSG);
				}
			}
			D.check_the_card();
		}
		rules.WhoIsWin(playerBurst,DealerBurst);
	}
}