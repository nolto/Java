package ch07;

import java.util.ArrayList;

class Product {
	int price;   // 제품의 가격
	int bonusPoint;  // 제품구매 시 제공하는 보너스점수
	String name;
	
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0); // 보너스점수는 제품가격의 10%
	 	}
	Product(int price, String name){
		this.price = price;
		this.name = name;
	}
	
	@Override //메서드 재정의
	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return String.format("%s",this.name);
	}
}

class Tv2 extends Product {
	Tv2() { super(100,"Tv2"); }
	/*
	@Override //메서드 재정의
	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "Tv";
	}*/
}

class Computer extends Product {
	Computer() { super(200,"Computer"); }
	/*
	@Override
	public String toString() {
		return "Computer";
	}*/
}

class Buyer {   // 고객, 물건을 사는 사람
	int money = 5000; // 소유금액
	int bonusPoint = 200; // 보너스점수
	Product list[] = new Product[30]; //Arraylist 동적할당 같은것. 순서있음
	//ArrayList productList = new ArrayList(); // 이 상태는 리턴타입이 오브젝트임. 따라서 사용할때마다 형변환 해줘야됨
	ArrayList<Product> productList = new ArrayList(); // 리턴타입을 Product형으로
	int i;
	int sum;

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		money -= p.price;   // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
		
		list[i++] = new Product(p.price,p.toString());
		productList.add(p); // 뺄땐 get. add는 오브젝트형
	}
	 
	void buy(Product p, boolean usePoint) {  
		if(usePoint) {
			int productPrice = p.price;
	      
		if((money + bonusPoint) < productPrice) {
			System.out.println("잔액 + 포인터가 부족하여 물건을 살수 없습니다.");
			return;
		}
	   
		if(productPrice >= bonusPoint) {
			productPrice -= bonusPoint;
			bonusPoint = 0;
		} else {    
			bonusPoint -= productPrice;
			productPrice = 0;
		}
	   
		money -= productPrice;   
		System.out.println(p + "을/를 구입하셨습니다.");
		list[i++] = new Product(p.price,p.toString());
		productList.add(p);
		} else {
			buy(p);
		}  
	}
	void printProduct() {
		System.out.println("============구매목록 및 잔여포인트============");
		for(int j=0;j<i;j++)
		{
			System.out.println(list[j]+" "+list[j].price+"만원");
			sum+=list[j].price;
		}
		System.out.println("남은 포인트: "+bonusPoint+"점");
		System.out.printf("사용한 금액(포인트 포함): %d\n",sum);
	}
}

class p368_PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv2());  
		printCurrent(b);
  
		b.buy(new Computer());
		printCurrent(b);
    
		b.buy(new Computer(), true);
		printCurrent(b);
	  
		b.buy(new Tv2(), true);
		printCurrent(b);
	  
		b.buy(new Computer(), false);
		printCurrent(b);
	  
		b.buy(new Tv2(), true);
		printCurrent(b);
		
		b.printProduct();
	}
	
	private static void printCurrent(Buyer b) {
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		System.out.println();
	}
}
/*
class Product{
	int price;
	int bonusPoint;	
	boolean point;

	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product{
	boolean point;
	Tv2(){
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);// Tv의 가격을 100만원으로 한다.
	}
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){super(200);}

	public String toString() {return "Computer";}
}

class Buyer{				// 고객, 물건을 사는 사람
	int money		= 1000;	// 소유금액
	int bonusPoint	= 0;	// 보너스점수	

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;				// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;		// 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	void buy(Product p, boolean point) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		if(point) {
			if(p.price<=bonusPoint){
				bonusPoint-=p.price;
			}
			else {			
				bonusPoint=0;
			}
			money -= p.price-bonusPoint;
		}
		else {
			money-=p.price;
		}
		System.out.println(p + "을/를 구입하셨습니다.");		
	}
}

public class p368_PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();

		b.buy(new Tv2());
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		
		b.buy(new Tv2());
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		
		b.buy(new Computer(),true);		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}
*/