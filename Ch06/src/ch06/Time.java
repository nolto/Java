package ch06;

public class Time {
	private int hour, min; // 인스턴스 변수
	//static int cv; // 스태틱 변수

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour>=0 && hour<24)
			this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if(min>=0 && min<60)
			this.min = min;
		else {
			return;
		}// 자바에서 void형은 반환형이 없다기보다 자동으로 return을 만들어준다! 다만 return 이후 값이 들어가면 안된다.
	}
	
	public void printTime()
	{
		System.out.printf("%02d : %02d\n",hour, min);
	}
	
}
// 변수들은 무조건 private로.
// 소스 우클릭 소스- 어쩌구 저쩌구 겟터 앤 셋터 에서 변수들 체크하면 자동 생성됨=> 캡슐화
// 변수 하나당 get(값 얻기(사람기준)) set(값 빼내오기) 생김

