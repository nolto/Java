package ch07;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Math.*; // 이거 쓰면 밑에 생략가능

public class p341_ImportTest {
	public static void main(String[] args) {
		//java.util.Date today = new Date();
		Date today = new Date();
		
		System.out.println(random()); //////// 이렇게 생략가능 Math.random() -> random()
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");//연도,월,일 순으로 date에 저장
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));
	}
}