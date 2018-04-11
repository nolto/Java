package Building;

public class Building {
	void build() {}
}


class Academy{}
class Bunker{}
class Barrack extends Building{
	LiftableImple l= new LiftableImple();
	
	void liftOff() {
		l.liftOff();
	}
	void move(int x, int y) {
		l.move(x, y);
	}
}
class Factory extends Building{
	LiftableImple l= new LiftableImple();
	
	void liftOff() {
		l.liftOff();
	}
	void move(int x, int y) {
		l.move(x, y);
	}
}

interface Liftable{
	void liftOff();
	void move(int x, int y);
	void stop();
	void land();	
}

class LiftableImple implements Liftable{

	@Override
	public void liftOff() {
		System.out.println("liftOff");		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub		
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