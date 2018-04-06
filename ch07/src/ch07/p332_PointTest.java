package ch07;

public class p332_PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Point2{
	int x, y;
	
	Point2(){}
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point2{
	int z;
	
	Point3D(int x, int y, int z){	// 오류남! 부모클래스에 기본생성자를 만들거나 super() 명시(부모클래스 생성자)
		
		this.x = x;	// 부모를 쓰겠다는건데 교재대로라면 접근이 막혀있음.
		this.y = y; // super를 쓰면 여기서 this.x 와 this.y를 다시 할당할 필요없음.
		this.z = z;		
	}
	
	String getLocation() {
		return "x :" + x + ", y :"+ y +", z :" + z;
	}
}