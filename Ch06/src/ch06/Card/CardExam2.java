package ch06.Card;

public class CardExam2 {
	public static void main(String[] args) {
		Card c1= new Card();
		c1.setShape("스페이스");
		c1.setNumber(5);
		
		Card c2= new Card();
		c2.setShape("다이아");
		c2.setNumber(10);
		
		c1.printState();
		c2.printState();
		
//		System.out.println(Card.HEIGHT); // static은 객체화 시키지 않아도 접근이 됨.(public이라고 가정)
		// 클래스 명으로 접근 가능한 것은 static 뿐..
//		System.out.println(c1.HEIGHT); // 이렇게 쓰면 안됨. static은 인.스.턴.스로 접근하라.
		// 객체로 접근X ex) Card.HEIGHT (O) c1.HEIGHT(X) 컴파일 에러는 아니지만 하지마~
	}
}