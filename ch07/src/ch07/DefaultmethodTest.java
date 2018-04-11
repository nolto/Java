package ch07;

public class DefaultmethodTest {
	public static void main(String args[]) {
		Child2 c = new Child2();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}


class Child2 extends Parent2 implements MyInterface, MyInterface2{
	public void method1() {// 인터페이스에도 똑같은 게 있다면 무시하고 요걸 씀
		System.out.println("method1() in Child");
	}
}

class Parent2{
	public void method2() {
		System.out.println("method2() in parent");
	}
}

interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in Myinterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}
