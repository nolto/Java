package blackJack2;

import java.util.ArrayList;

public class Gamer extends Player{
	ArrayList<Card> p_card = new ArrayList<Card>();
	
	@Override
	void Draw(Deck all) {
		p_card.add(all.getRandomCard());
	}
	@Override
	int check_sum() {
		int sum=0;
		for(Card idx : p_card) {
			sum+=idx.getPoint();
		}
		return sum;
	}
	
	@Override
	void check_the_card(){
		int sum=0;
		for(Card idx : p_card){
			System.out.printf("Your Card : %s\n", idx);
		}
		sum=this.check_sum();
		System.out.printf("Your Score : %2d Point\n",sum);
	}
}