package blackJack2;

import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Deck all_card = new Deck();
		Dealer D = new Dealer(all_card);
		Gamer G = new Gamer(all_card);
		Scanner sc = new Scanner(System.in);
		
		D.check_the_card();
		G.check_the_card();
		
	}
}