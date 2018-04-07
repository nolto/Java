package BlackJack2;

import java.util.ArrayList;

public class Deck{
	ArrayList<Card> card_info = new ArrayList<Card>();
	private int Point[]		= {1,2,3,4,5,6,7,8,9,10,10,10,10};
	
	public Deck(){
		String number[]	= {"A","1","2","3","4","5","6","7","8","9","J","Q","K"};	
		String shape[]	= {"♠","♥","♦","♣"};
				
		for(int Figure= 0;Figure<shape.length;Figure++) {// 4
			for(int num=0;num<number.length;num++) { // 13
				card_info.add(new Card(shape[Figure],number[num])); // 만약 Card가 부모이고 Deck이 자식이라면 이렇게 못씀.또다른 슈퍼생성자를 만들라고 뜸
			}
		}
	}
	
	public Card getRandomCard() {
		int r = (int) (Math.random() * card_info.size());
		Card c = card_info.get(r);
		card_info.remove(r);
		return c;
	}	
}
