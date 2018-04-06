package BlackJack;
import static BlackJack.Static_final_data.*;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Deck Deck = new Deck();
		Gamer I = new Gamer();
		Dealer Dealer = new Dealer();
		Scanner sc = new Scanner(System.in);
		String draw;	// 사용자에게 카드를 더 받을것인지 여부를 확인하여 저장하는 변수
		
		int card=0;
		boolean player_burst = false;
		boolean dealer_burst = false;
		
		/*
		for(int i=0;i<TOTAL_CARD_NUMBER;i++)
			Deck.Card_check(i);
		*/
		for(int i=0;i<2;i++) {
			card=I.Draw();
			I.setDeck_info(Deck.getShape(card),Deck.getNumber(card),Deck.getPoint(card));
			System.out.println("My Card: "+Deck.getShape(card)+Deck.getNumber(card));//
			
			card=Dealer.Draw();
			Dealer.setDeck_info(Deck.getShape(card),Deck.getNumber(card),Deck.getPoint(card));
		}
		System.out.println("Dealer Card: "+Dealer.get_shape(0)+Dealer.get_number(0));//
				
		while(true) {
			System.out.printf("Your Score is %d point.\nDo you need draw a card?(y/n) : ",I.sum());
			draw=sc.next();
			if(draw.equals("y") || draw.equals("Y")) {		// 카드 더 받음
				card=I.Draw();
				I.setDeck_info(Deck.getShape(card),Deck.getNumber(card),Deck.getPoint(card));
				System.out.println("My Card: "+Deck.getShape(card)+Deck.getNumber(card));//
			}else if(draw.equals("n") || draw.equals("N")) {		// 플레이어는 승부를 끝낼 준비를 함
				break;
			}else {
				System.out.println("Please enter the correct value.");
				continue;
			}
			if(I.sum()>BLACKJACK) {
				System.out.println("BOOOOM!! Busted~! You lose");
				player_burst=true;
				break;
			}			
		}
		if(Dealer.sum()<17 && Dealer.count==2) { // 딜러는 2장 합계 16점 이하일때 무조건 1장 더. 17점 이상이면 추가할 수 없음.
			card=Dealer.Draw();
			Dealer.setDeck_info(Deck.getShape(card),Deck.getNumber(card),Deck.getPoint(card));
			while(true) {
				if(Dealer.sum()<17 && Dealer.count>2) {// 3장 이상 받았는데 16점 이하인 경우 딜러가 더 받을지 말지 선택
					System.out.println("Dealer, Do you want draw a card?(y/n)");
					draw=sc.next();
					if(draw.equals("Y") || draw.equals("y")) {
						card=Dealer.Draw();
						Dealer.setDeck_info(Deck.getShape(card),Deck.getNumber(card),Deck.getPoint(card));
					}
				}
				break;
			}
		}
		if(Dealer.sum()>BLACKJACK && player_burst==false) {
			System.out.println("BOOOOM!! Busted~! Dealer lose");
			dealer_burst=true;
		}
		if(dealer_burst!=true) {			
			if(Dealer.sum()>I.sum() && player_burst==false) {
				System.out.printf("Dealer Score: %d , Player Score : %d. You lose!\n",Dealer.sum(),I.sum());
			}else if(Dealer.sum()<I.sum() && player_burst==false) {
				System.out.printf("Dealer Score: %d , Player Score: %d. You Win!\n",Dealer.sum(),I.sum());
			}else if(Dealer.sum()==I.sum()&& player_burst==false){
				System.out.printf("Dealer Score: %d , Player Score : %d. DRAW GAME!\n",Dealer.sum(),I.sum());
			}
		}
	}
}
