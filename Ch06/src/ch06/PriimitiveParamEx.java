package ch06;

public class PriimitiveParamEx {
	public static void main(String[] args){
		Data d = new Data();
		d.setX(10);
		System.out.println("1.main(): x = "+d.getX()); // 10
		change(d.getX()); // change 1000
		System.out.println("2.main(): x = "+d.getX()); // 2.main 10
		change(d); // Data change 1000. 왜냐면 객체이름을 보낸것=주소값을 보낸 것.
		System.out.println("3.main(): x = "+d.getX()); // 3.main 1000
	}
	static void change(int x) {
		x= 1000;
		System.out.println("change(): x = "+ x);
	}
	static void change(Data da) { // 오버로딩 파라미터 타입만 다름.
		da.setX(1000);
		System.out.println("Data change(): x = "+ da.getX());
	}
}

class Data{
	private int x;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
}