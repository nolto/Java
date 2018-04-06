package BlackJack;

import static BlackJack.Static_final_data.*;

import java.util.Random;

abstract public class Player {
	protected Random make_r = new Random();
	private int card;
	protected String Deck_shape[]		= new String[11];
	protected String Deck_number[]		= new String[11];
	protected int Deck_point[]			= new int[11];
	protected int count=0;
	private int sum=0;
	
	int Draw(){
		card=make_r.nextInt(TOTAL_CARD_NUMBER);
		return card;
	}
	protected void setDeck_info(String shape,String number,int point){
		this.Deck_shape[count]=shape;
		this.Deck_number[count]=number;
		this.Deck_point[count]=point;
		count++;
	}
	protected String get_shape(int i) {
		return this.Deck_shape[i];
	}
	protected String get_number(int i) {
		return this.Deck_number[i];
	}
	byte Deck_check() {
		if(sum()<BLACKJACK) {
			return 0;
		}else if(sum()>BLACKJACK) {
			return -1;
		}else {
			return 1;
		}
	}
	int sum() {
		sum=0;
		for(int j=0;j<count;j++) {
			this.sum+=Deck_point[j];
		}
		return this.sum;
	}	
}
