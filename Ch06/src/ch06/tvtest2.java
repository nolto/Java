package ch06;

public class tvtest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 channel: "+t1.channel);
		System.out.println("t2 channel: "+t2.channel);
		t1.channel = 7;
		System.out.println("t1 channel: "+t1.channel);
		System.out.println("t2 channel: "+t2.channel);
		System.out.println("t1 channel: "+t1.toString()); //주소값 ?
		System.out.println("t2 channel: "+t2.toString());
//		System.out.println(t1.power);
//		t1.power();
//		System.out.println(t1.power);
		Tv t3=t1;
		t3.channelDown();
		System.out.println("t1 channel: "+t1.channel); // 6! t3=t1은 가리키는 주소를 바꿈
	}
}