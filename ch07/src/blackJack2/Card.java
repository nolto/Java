package blackJack2;

public class Card {
	private String shape;
	private String num;
	private int point;
	
	public Card(String shape, String num, int point) {
		this.shape=shape;
		this.num=num;
		this.point=point;
	}
	
	@Override
	public String toString() {
		return this.shape+" "+this.num;
	}

	public int getPoint() {
		return point;
	}
	
}