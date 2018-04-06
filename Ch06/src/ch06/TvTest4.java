package ch06;
/*
class Tv2{ // 자바는 클래스 선언 밑에 해줘도 문제 없다.
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
*/

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr= {new Tv(), new Tv(), new Tv()}; // 같은 패키지 안이라서 인지함
		Tv t;
		for(int i=0;i<tvArr.length;i++)
		{
			t=tvArr[i];
			t.channel = i+10;
		}
		
		for(int i=0;i<tvArr.length;i++)
		{
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d\n",i,tvArr[i].channel);
			System.out.printf("toString(): %s\n\n",tvArr[i].toString());
		}
	}
}
