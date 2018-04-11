package Building;
/// 재사용에 유연하진 않음. 예를 들어 유닛이 뜨고 착륙하는 특징을 가지기 힘듬 현재 코드에서.
public class Building2 {

}
class Academy2 extends Building2{}
class Bunker2 extends Building2{}
class Barrack2 extends LiftableImple2{}
class Factory2 extends LiftableImple2{}

interface Liftable2{
	void liftOff();
	void move(int x, int y);
	void stop();
	void land();
}

class LiftableImple2 extends Building2 implements Liftable2{

	@Override
	public void liftOff() {
		System.out.println("liftOff");	
	}

	@Override
	public void move(int x, int y) {
		System.out.printf("move %d, %d",x,y);			
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub		
	}
	
}
