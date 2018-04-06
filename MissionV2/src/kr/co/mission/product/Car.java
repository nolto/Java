package kr.co.mission.product;

import kr.co.mission.util.Variable;

public class Car extends Product {
	final public static short AVANTE = 0; 
	final public static short SONATA = 1; 
	final public static short GRANDURE = 2; 
	final public static short GENESIS = 3; 
	
	public Car(short type) {		
		switch(type) {
		case 0:
			setName(Variable.CAR1);
			setPrice(10000);
			break;
		case 1:
			setName(Variable.CAR2);
			setPrice(20000);
			break;
		case 2:
			setName(Variable.CAR3);
			setPrice(40000);
			break;
		case 3:
			setName(Variable.CAR4);
			setPrice(60000);
			break;
		}
	}
}
