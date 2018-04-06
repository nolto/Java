package kr.co.koreait;

public class Money {
	public final static int money100 = 100;
	public final static int money500 = 500;
	public final static int money1000 = 1000;
	public final static int money5000 = 5000;
	public final static int money10000 = 10000;
	
	public static void showMoneyList() {
		System.out.println("- 현금 주입 -");
		System.out.println("1. 100원");
		System.out.println("2. 500원");
		System.out.println("3. 1,000원");
		System.out.println("4. 5,000원");
		System.out.println("5. 10,000원");
		System.out.println("6. 주입 완료");
	}
}
