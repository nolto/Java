package ch06;

public class TimeExam {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.setHour(12);
		t1.setMin(23);
		
		Time t2 = new Time();
		t2.setHour(23);
		t2.setMin(12);
		
		Time t3 = new Time();
		t3.setHour(7);
		t3.setMin(42);
		
		// 시간 00-23
		// 분 00-59
		
		Time test = new Time();
		test.setHour(13);
		test.setMin(99);
		/*
		System.out.printf("%02d : %02d\n",t1.getHour(),t1.getMin());
		System.out.printf("%02d : %02d\n",t2.getHour(),t2.getMin());
		System.out.printf("%02d : %02d\n",t3.getHour(),t3.getMin());
		*/
		t1.printTime();
		test.printTime();
	}
}
