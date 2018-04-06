package ch06;

public class Tv{ // 클래스명과 java 파일명 같게..
	String color;
	boolean power;
	int channel;
	
	void power() {
		power=!power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}
