package ch06;

class Data1{
	int value;
}
class Data2{
	int value;
	
	Data2(){ // 디폴트 생성자. 생성자를 하나라도 만들면 컴파일러가 따로 만들어주지 않음.
		
	}
	Data2(int x){ // 매개변수가 있는 생성자.
		value = x;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
			Data1 d1 = new Data1();
			Data2 d2 = new Data2();
			Data2 d3 = new Data2(3);
		}
	}