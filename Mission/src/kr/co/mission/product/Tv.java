package kr.co.mission.product;

import static kr.co.mission.util.Variable.*;

import kr.co.mission.util.Variable;

public class Tv extends Product {
	final private int inch;
	final private int[] priceList = {TV1_PRICE, TV2_PRICE, TV3_PRICE};
	final private int[] tvInchList = {TV1_INCH, TV2_INCH, TV3_INCH};
	final public static short TV_13 = 0; 
	final public static short TV_15 = 1; 
	final public static short TV_20 = 2; 
	
	public Tv(short idx) {
		super.setName(Variable.TV);
		super.setPrice(priceList[idx]);
		this.inch = tvInchList[idx];
	}
	
	@Override
	public String toString() {
		return String.format("%s %d��ġ\t%,d��", getName(), inch, getPrice());
	}
}
