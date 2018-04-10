package ch07;

public class RepairableTest {
	public static void main(String args[]) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		SCV scv2 = new SCV();
		Medic medic = new Medic();
		Firebat firebat = new Firebat();
		
		scv.repair(tank);			// SCV가 Tank를 수리하도록 한다.
		scv.repair(dropship);
//		scv.repair(marine);			// repair(Repairable) in SCV cannot be applied to (Marine)
		scv.repair(scv);
		scv.repair(scv2);
		
		medic.rescure(firebat);
	}
}

interface Repairable{}
interface Rescureable{}

class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
	// ...
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);			// Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);		// Dropship의 HP는 125이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
	//...
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable,Rescureable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(!this.equals(r)) {		// 주소값을 비교하여 자가수리를 할 수 없도록 처리
			if(r instanceof Unit) {
				Unit u = (Unit)r;
				while(u.hitPoint!=u.MAX_HP) {
					/* Unit의 HP를 증가시킨다. */
					u.hitPoint++;
				}
				System.out.println(u.toString()+"의 수리가 끝났습니다.");
			}
		}else {
			System.out.println("본인을 수리할 수 없습니다.");
		}
	}
	public String toString() {
		return "SCV";
	}
}

class Medic extends GroundUnit implements Rescureable{
	Medic(){
		super(60);
		hitPoint = MAX_HP;
	}
	void rescure(Rescureable a) {
		if(a instanceof Unit) {
			Unit u = (Unit)a;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 치료가 끝났습니다.");
		}
	}
	public String toString() {
		return "Medic";
	}
}

class Firebat extends GroundUnit implements Rescureable{
	Firebat(){
		super(50);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Firebat";
	}	
}