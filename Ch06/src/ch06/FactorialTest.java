package ch06;

public class FactorialTest {
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
	// static이 붙으면 FacotiralTest 클래스를 객체로 생성하지 않아도 접근 가능.
	static int factorial(int n) { // public 선언시 같은 패키지 안 다른 java파일에서도 접근 가능
		int result =0;
		
		if(n==1) {
			result = 1;
		}
		else if(n==0) {
			result = 0;
		}
		else if(n<0 || n>12) { // 12인 이유는 int의 한계 표현범위
			return -1;
		}
		else {
			result =n * factorial(n-1);
		}
		return result;
	}
}
