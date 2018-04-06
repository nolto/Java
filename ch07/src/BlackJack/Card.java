package BlackJack;

import static BlackJack.Static_final_data.*;

public class Card {
	private String shape[] = new String[TOTAL_CARD_NUMBER];
	private String number[] = new String[TOTAL_CARD_NUMBER];
	private int point[] = new int[TOTAL_CARD_NUMBER];
	
	protected void setShape(String shape,int i) {
		this.shape[i] = shape;
	}
	protected void setNumber(String number,int point,int i) {
		this.number[i] = number;
		this.point[i] = point;
	}
	
	protected String getShape(int i) {
		return this.shape[i];
	}
	protected String getNumber(int i) {
		return this.number[i];
	}
	protected int getPoint(int i) {
		return this.point[i];
	}
	/*
	void Card_check(int i) {
			System.out.printf("%s %2s %2d점\n",this.shape[i], this.number[i], this.point[i]);
	}
	*/
}
