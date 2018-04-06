package kr.co.mission.product;
// 이름과 가격 저장
public class Product {
	private String name;
	private int price;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public int getPrice() {		
		return price;
	}
	public void setPrice(int price) {
		if(price < 0)
			return;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%,d원", getName(), getPrice());
	}
}
