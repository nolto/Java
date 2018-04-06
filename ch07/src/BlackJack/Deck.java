package BlackJack;

import static BlackJack.Static_final_data.*;

public class Deck extends Card{
	
	Deck(){
		int card_number=0;
		
		for(int i=0;i<TOTAL_CARD_NUMBER;i++) {
			if(i<CARD_COUNT) {
				super.setShape("♠",i);
			}else if(i >= CARD_COUNT && i<CARD_COUNT*2){
				super.setShape("♥",i);
			}else if(i >= CARD_COUNT*2 && i<CARD_COUNT*3) {
				super.setShape("♦",i);
			}else {
				super.setShape("♣",i);
			}
			if(i==0 || i==CARD_COUNT || i==CARD_COUNT*(2) || i==CARD_COUNT*(3) ){	
				super.setNumber("A",1,i);
			}else if(i==CARD_COUNT-3 || i==CARD_COUNT*(1+1)-J_LOCATION|| i==CARD_COUNT*(2+1)-J_LOCATION || i==CARD_COUNT*(3+1)-J_LOCATION){
				super.setNumber("J",10,i);
			}else if(i==CARD_COUNT-2 || i==CARD_COUNT*(1+1)-Q_LOCATION|| i==CARD_COUNT*(2+1)-Q_LOCATION || i==CARD_COUNT*(3+1)-Q_LOCATION) {
				super.setNumber("Q",10,i);
			}else if(i==CARD_COUNT-1 || i==CARD_COUNT*(1+1)-K_LOCATION|| i==CARD_COUNT*(2+1)-K_LOCATION || i==CARD_COUNT*(3+1)-K_LOCATION) {
				super.setNumber("K",10,i);
			}else {
				if(i<CARD_COUNT) {
					super.setNumber(Integer.toString(i+1),i+1,i);
				}
				else {
					super.setNumber(Integer.toString(i%CARD_COUNT+1),i%CARD_COUNT+1,i);
				}
			}
		}	
	}
}
