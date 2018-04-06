package abst2;

import java.util.ArrayList;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop()				 {/* 현재 위치에 정지 */}
	void location() {
		System.out.println(this.x+","+this.y);
	}
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {this.x=x;this.y=y;}
	void StimPack() 		{/* 스팀팩을 사용한다. */}
}
class Tank extends Unit{	// 탱크
	@Override
	void move(int x, int y) {this.x=x;this.y=y;}
	void changeMode() 		{/* 공격모드를 변환한다. */}
}
class Dropship extends Unit{	// 수송선
	@Override
	void move(int x, int y) {this.x=x;this.y=y;}
	void load() 			{/* 선택된 대상을 태운다.*/}
	void unload() 			{/* 선택된 대상을 내린다.*/}
}

class Main{
	static ArrayList<Unit> list = new ArrayList<Unit>();
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
				
		//list.add(new Marine());
		addUnits(new Marine());
		addUnits(new Marine());
		addUnits(new Marine());
		addUnits(new Marine());
		addUnits(new Marine());
		addUnits(new Marine());
		addUnits(new Tank());
		addUnits(new Tank());
		addUnits(new Tank());
		addUnits(new Tank());
		addUnits(new Dropship());
		addUnits(new Dropship());
		addUnits(new Dropship());
		
		for(Unit a:list) {
			a.move(200, 300);
			a.location();
		}
		/////////////////////////////////////////
		/*
		System.out.println();
		Unit group[] = new Unit[12];
		group[0]=m1;
		group[1]=m2;
		group[2]=m3;
		for(int i=0;i<3;i++) {
			group[i].move(200,300);
			group[i].location();
		}
		*/
	}
	private static void addUnits(Unit u) {
		if(list.size() <12) {
			list.add(u);
		}
	}
}