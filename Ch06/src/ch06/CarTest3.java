package ch06;

class Car3{
	String color;
	String gearType;
	int door;
	
	/*
	 * {
	 * 	color = "yellow";
	 * 	gearType="manual";
	 * 	door=5;
	 * } 
	 * */ // 이러면 모든 생성자들 사이에 끼어들어감!(처음 부분)
	
	Car3(){
		this("white","auto",4);
	}
	
	Car3(Car3 c){	// 인스턴스의 복사를 위한 생성자.
		this.color		= c.color;	// 여기선 값을 넣으므로 레퍼런스 참조가 아니라 값 복사가 됨.
		this.gearType	= c.gearType;
		this.door		= c.door;
	}
	
	Car3(String color, String gearType, int door){
		this.color		= color;
		this.gearType	= gearType;
		this.door		= door;
	}
}

public class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);	// c1의 복사본 c2를 생성한다.
		System.out.println("c1의 color="+c1.color+", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType=" + c2.gearType+ ", door="+c2.door);
		
		c1.door=100;	// c1의 인스턴스변수 door의 값 변경
		System.out.println("c1.door=100 수행 후");
		System.out.println("c1의 color="+c1.color+", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}
