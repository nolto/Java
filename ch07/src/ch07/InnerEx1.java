package ch07;
/// 중요하지 않은듯하니 넘어가자(익명클래스로 대체했다고 함)
public class InnerEx1 {
	class InstanceInner{			// 하나의 지역변수 혹은 지역메서드로 생각하면 될듯
		int iv = 100;
//		static int cv = 100;			// static변수를 선언할 수 없다.
		final static int CONST = 100;	// final static은 상수이므로 허용
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;			// static클래스만 static멤버를 정의할 수 있다.
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300;
			final static int CONST = 300;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(InstanceInner.CONST);		// 외부에서 내부 클래스를 사용하려면 final+static이어야 사용 가능한 듯
		System.out.println(StaticInner.cv);
		InnerEx1 hi = new InnerEx1();
//		InstanceInner hello = hi.new InstanceInner();
//		System.out.println(hello.iv);
	}
}
