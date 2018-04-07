package blackJack2;

import java.util.ArrayList;

public class Gamer extends Player{
	ArrayList<Card> p_card = new ArrayList<Card>();
	
	Gamer(Deck all){
		p_card.add(all.getRandomCard());	// 카드 2장 드로우
		p_card.add(all.getRandomCard());		
	}
	
	@Override
	void check_the_card(){
		int sum=0;
		for(Card idx : p_card){
			System.out.printf("Your Card : %s\n", idx);
			sum+=idx.getPoint();
		}
		System.out.printf("Your Score : %2d\n",sum);
	}
}