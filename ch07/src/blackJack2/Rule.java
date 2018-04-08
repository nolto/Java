package blackJack2;

public class Rule {
	private Gamer G;
	private Dealer D;
	
	private static final int ALL_CARD=52;
	private static final int BLACK_JACK=21;
	private static final int DEALER_PENALTY_SCORE=16;
	private static final int DEALER_PENALTY_CARD_COUNT=2;
	
	public Rule(Dealer d,Gamer g) {
		this.G=g;
		this.D=d;
	}
	public boolean Gamer_burst_Check() {
		int check_sum=G.check_sum();
		if(check_sum>BLACK_JACK) {
			System.out.println("Bursted~~!!! you lose");
			return true;
		}
		return false;
	}
	public int Dealer_burst_Check() {
		int check_sum=D.check_sum();
		if(check_sum>BLACK_JACK) {
			System.out.println("Bursted~~!!! Dealer lose");
			return 1;
		}else if(check_sum<=DEALER_PENALTY_SCORE && D.d_card.size()<=DEALER_PENALTY_CARD_COUNT) {	
			return -1;
		}
		return 0;
	}
	public void WhoIsWin(boolean PlayerContinue,boolean DealerContinue) {
		int gamerSum	= G.check_sum();
		int dealerSum	= D.check_sum();
		System.out.printf("Dealer Score : %2d , Gamer Score : %2d\n",dealerSum,gamerSum);
		if((PlayerContinue!=true) && (DealerContinue!=true)) {
			if(gamerSum>dealerSum) {
				System.out.println("You win!!!");
			}else if(gamerSum<dealerSum) {
				System.out.println("You lose!!!");
			}else {
				System.out.println("Draw game!");
			}
		}
	}
}
