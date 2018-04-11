package Building;

public class InterfaceTest3 {
	public static void main(String args[]) {
		A1 a = new A1();
		a.methodA();
	}
}

class A1{
	void methodA() {
		I i = InstanceManager.getinstance();		// B1()을 i에 할당할듯
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I{
	public abstract void methodB();
}

class B1 implements I{
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public String toString() {	return "class B";}
}

class InstanceManager{
	public static I getinstance() {
		return new B1();
	}
}