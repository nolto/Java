package ch06;

class Car{
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	
	Car(){}
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {
	public static void main(String[] ddd) {
		Car c1 = new Car();
		c1.color	= "white";	// private였다면 접근못함. 원래 메소드 통해서 넣어야 함
		c1.gearType	= "auto";	// 바람직하지 않음.
		c1.door		= 4;
		
		Car c2 = new Car("White", "auto", 4);
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" +c1.gearType+", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" +c2.gearType+", door="+c2.door);
	}
}
