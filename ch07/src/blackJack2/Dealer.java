package blackJack2;

import java.util.ArrayList;

public class Dealer extends Player{
	ArrayList<Card> d_card = new ArrayList<Card>();
	
	Dealer(Deck all){
		d_card.add(all.getRandomCard());	// 카드 2장 드로우
		d_card.add(all.getRandomCard());		
	}
	
	@Override
	void check_the_card(){
		int sum=0;
		for(Card idx : d_card){
			System.out.printf("Dealer Card : %s\n", idx);
			sum+=idx.getPoint();
//			break;
		}
		System.out.printf("Dealer's Score : %2d\n",sum);//
	}
}