package Building;
/// 재사용에 유연하진 않음. 예를 들어 유닛이 뜨고 착륙하는 특징을 가지기 힘듬 현재 코드에서.
public class Building2 {

}
class Academy extends Building{}
class Bunker extends Building{}
class Barrack extends LiftableImple{}
class Factory extends LiftableImple{}

interface Liftable{
	void liftOff();
	void move(int x, int y);
	void stop();
	void land();
}

class LiftableImple extends Building2 implements Liftable{

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
