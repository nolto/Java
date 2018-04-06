package kr.co.koreait.drink;

public class Drink {
	public final static String COLA = "콜라";
	public final static String CIDER = "사이다";
	public final static String POCARI = "포카리";
	public final static String ORANC = "오란씨";
	
	public final static int TYPE_COLA = 0; 
	public final static int TYPE_CIDER = 1; 
	public final static int TYPE_POCARI = 2; 
	public final static int TYPE_ORANC = 3; 
	
	public final static int COLA_PRICE = 600;
	public final static int CIDER_PRICE = 600;
	public final static int POCARI_PRICE = 700;
	public final static int ORANC_PRICE = 700;
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	public String toString() {
		return String.format("%s - %,d", this.name, this.price);
	}
}
