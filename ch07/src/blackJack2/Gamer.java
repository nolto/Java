package blackJack2;

import java.util.ArrayList;
import static blackJack2.Message.*;

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
			System.out.printf(GAMER_CARD_CHECK_MSG, idx);
		}
		sum=this.check_sum();
		System.out.printf(GAMER_SCORE_CHECK_MSG,sum);
	}
}