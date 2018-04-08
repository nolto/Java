package blackJack2;

abstract public class Player {
	abstract void Draw(Deck all);
	abstract int check_sum();
	abstract void check_the_card();	
}
