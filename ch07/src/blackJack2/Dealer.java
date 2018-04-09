package blackJack2;

import java.util.ArrayList;
import static blackJack2.Message.*;

public class Dealer extends Player{
	ArrayList<Card> d_card = new ArrayList<Card>();	// private 권장
	
	@Override
	void Draw(Deck all) {
		d_card.add(all.getRandomCard());
	}
	@Override
	int check_sum() {
		int sum=0;
		for(Card idx : d_card) {
			sum+=idx.getPoint();
		}
		return sum;
	}
	
	@Override
	void check_the_card(){
		for(Card idx : d_card){
			System.out.printf(DEALER_CARD_CHECK_MSG, idx);
			break;	// 딜러는 카드 하나만 보여줘야 되는거 아닐까..하지만 구현단계이고 애매하니까 일단 넣도록 함.
		}
		int sum=this.check_sum();
		System.out.printf(DEALER_SCORE_CHECK_MSG,sum);//
	}
}