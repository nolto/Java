package ch07;

class Tv{
	boolean power;		// 전원상태(on/off)
	int channel;		// 채널
	
	void power()		{	power = !power;	}
	void channelUp()	{	++channel;		}
	void channelDown()	{	--channel;		}
}

class CaptionTv extends Tv{
	boolean caption;		// 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {		// 캡셩 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);			
		}
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;						// 부모 클래스로부터 상속받은 멤버
		ctv.channelUp();						// 부모 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);		// 정수 11이 출력
		ctv.displayCaption("Hello, World");		// caption 초기값은 false이므로 문자열을 넣어도..
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	}
}
