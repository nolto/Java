package ch06.Card;

public class Card {
	//space, heart, Clover, Diamond
	// 1~13 카드 j=11 q=12 k=13
	private String shape;
	private int number;
	
	private final int WIDTH = 100; // final은 상수 만드는 키워드.
	private final int HEIGHT =250; // 상수 이름은 대문자로 만들자.
	//static int width = 100; // 메모리에 바로 올라오는데 일반변수와 다른 메모리에 저장.
	// 클래스는 제거가 쉬운데 static은... C언어의 데이터메모리(static 포함)가 저장되는 영역같음.
	
	public String getShape() { // 지금은 쓰지 않으니 주석처리해도 되기는 함.
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
		//this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void Collision(String shape, int number) {
		this.shape=shape;
		this.number=number;
	}
	
	public void printRect() {
		System.out.println(WIDTH+"-"+HEIGHT);
	}
	
	public void printState() {
		System.out.printf("%s - %d\n",shape, number);
	}
	
}