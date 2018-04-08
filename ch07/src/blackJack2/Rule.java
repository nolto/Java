package blackJack2;

public class Rule {
	private Gamer G;
	private Dealer D;
	
	public Rule(Dealer d,Gamer g) {
		this.G=g;
		this.D=d;
	}
	public boolean Gamer_burst_Check() {
		int check_sum=G.check_sum();
		if(check_sum>21) {
			System.out.println("Bursted~~!!! you lose");
			return true;
		}
		return false;
	}
	public int Dealer_burst_Check() {
		int check_sum=D.check_sum();
		if(check_sum>21) {
			System.out.println("Bursted~~!!! Dealer lose");
			return 1;
		}else if(check_sum<17 && D.d_card.size()<3) {	
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
