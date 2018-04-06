package ch06;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L,3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		//long result5 = mm.max(5L,3L);
		
		System.out.println("1 :"+result1);
		System.out.println("2 :"+result2);
		System.out.println("3 :"+result3);
		System.out.println("4 :"+result4);
		System.out.println("5 :"+mm.divide(5L, 3L)); //double이 long보다 커서 담을수 있다.
	}
}

class MyMath{
	long add(long a, long b){
		return a + b;
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(long a, long b) {
		if (a<=0 || b<=0)
			return 0;
		return (double)a / b;
	}
	double divide2(double a, double b) {
		return a / b;
	}
	long max(long a, long b) {
		if (a>b)
			return a;
		else
			return b;
	}
}