package ch07;

class Card3{
	final int NUMBER;			// 상수지만 선언과 함꼐 초기화 하지 않고
	final String KIND;			// 생성자에서 단 한번만 초기화할 수 있다.
	static int width	= 100;
	static int height	= 250;

	Card3(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card3(){
		this("HEART",1);
	}
	
	@Override // 부모클래스에서 안썼는데 상속 쓰면 오류 표시
	public String toString() {
		return KIND + " "+ NUMBER;
	}
}

public class p346_FinalCardTest {
	public static void main(String[] args) {
		Card3 c = new Card3("HEART", 10);
//		c.NUMBER = 5;					// 에러!!! final 선언된 변수 값 변경시도
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);			// System.out.println(c.toString()); toString이 기본으로 찍힘
										// 근데 toString을 선언했으니 String toString()이 실행
	}
}