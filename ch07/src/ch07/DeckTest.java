package ch07;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();		// 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(-1);			// Deck 과 Card는 자식 부모 관계는 아니지만 할당은 가능.
		System.out.println(c);
		
		d.shuffle();
		c = d.pick(-1);
		System.out.println(c);
	}
}

class Deck{
	final int CARD_NUM = 52;		// 카드의 개수
	Card cardArr[] = new Card[CARD_NUM];	// ctrl + 좌클릭
	
	Deck() {	// Deck의 카드를 초기화한다.
		int i=0;
		
		for(int k=Card.KIND_MAX; k > 0;k--)
			for(int n=0;n < Card.NUM_MAX ; n++)
				cardArr[i++] = new Card(k, n+1);
	}
	
	Card pick(int index) {			// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		if(index>CARD_NUM-1 || index<0) {			
			return cardArr[0];
			}
		return cardArr[index];
	}
	
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int i=0;i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
} // Deck클래스의 끝

class Card{
	static final int KIND_MAX	= 4;		// 카드 무늬의 수
	static final int NUM_MAX	= 13;		// 무늬별 카드 수
	
	static final int SPADE		= 4;
	static final int DIAMOND	= 3;
	static final int HEART		= 2;
	static final int CLOVER		= 1;
	int kind;
	int number;
	
	Card(){
		this(SPADE, 1);
	}
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override // 오버라이딩 할땐 있는게 좋아~(실수로 부모클래스에서 안 만들었을 때 오류 표시)
	public String toString() { // object 객체에 toString객체가 있음 근데 이렇게 하면 오버라이딩이 됨
		String kinds[] = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		//String kinds[] = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";	// 숫자 10은 X로 표현
		return "kind : " + kinds[this.kind]
				+", number : " + numbers.charAt(this.number); //문자 하나씩 빼오는 charAt메소드.
	}	// toString()의 끝
}	// Card 클래스의 끝
