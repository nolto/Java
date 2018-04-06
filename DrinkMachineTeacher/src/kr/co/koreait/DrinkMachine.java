package kr.co.koreait;

import static kr.co.koreait.drink.Drink.CIDER;
import static kr.co.koreait.drink.Drink.CIDER_PRICE;
import static kr.co.koreait.drink.Drink.COLA;
import static kr.co.koreait.drink.Drink.COLA_PRICE;
import static kr.co.koreait.drink.Drink.ORANC;
import static kr.co.koreait.drink.Drink.ORANC_PRICE;
import static kr.co.koreait.drink.Drink.POCARI;
import static kr.co.koreait.drink.Drink.POCARI_PRICE;

import java.util.ArrayList;

import kr.co.koreait.drink.Cider;
import kr.co.koreait.drink.Cola;
import kr.co.koreait.drink.Drink;
import kr.co.koreait.drink.Oranc;
import kr.co.koreait.drink.Pocari;

public class DrinkMachine {
	private int money = 0;

	private ArrayList<Cola> colaArray = new ArrayList<Cola>();
	private ArrayList<Oranc> orancArray = new ArrayList<Oranc>();
	private ArrayList<Pocari> pocariArray = new ArrayList<Pocari>();
	private ArrayList<Cider> ciderArray = new ArrayList<Cider>();

	public DrinkMachine() {
		for (int i = 0; i < 50; i++) {
			colaArray.add(new Cola());
			orancArray.add(new Oranc());
			pocariArray.add(new Pocari());
			ciderArray.add(new Cider());
		}
	}

	public void showMenu() {
		System.out.println("- 메뉴 -");
		System.out.printf("1. %s - %,d원\n", COLA, COLA_PRICE);
		System.out.printf("2. %s - %,d원\n", CIDER, CIDER_PRICE);
		System.out.printf("3. %s - %,d원\n", ORANC, ORANC_PRICE);
		System.out.printf("4. %s - %,d원\n", POCARI, POCARI_PRICE);
		System.out.println("5. 종료");
	}

	public void buyMenu(int type) {

		Drink choice = null;
		switch (type) {
		case 1:
			choice = colaArray.get(0);
			break;
		case 2:
			choice = ciderArray.get(0);
			break;
		case 3:
			choice = orancArray.get(0);
			break;
		case 4:
			choice = pocariArray.get(0);
			break;
		}

		if (choice.getPrice() <= money) {
			switch (type) {
			case 1:
				colaArray.remove(choice);
				break;
			case 2:
				ciderArray.remove(choice);
				break;
			case 3:
				orancArray.remove(choice);
				break;
			case 4:
				pocariArray.remove(choice);
				break;
			}

			money -= choice.getPrice();

			System.out.println(choice);
		} else {
			System.out.println("금액이 부족하여 구매할 수 없습니다.");
		}

	}

	public int getMoney() {
		return money;
	}

	public void addMoney(int money) {
		this.money += money;
	}

	public void displayChange() {
		System.out.printf("남은돈 %,d입니다.\n", money);
	}

	public void displayAmount() {
		System.out.println("- 재고 출력 -");
		System.out.printf("%s %d\n", COLA, colaArray.size());
		System.out.printf("%s %d\n", CIDER, ciderArray.size());
		System.out.printf("%s %d\n", ORANC, orancArray.size());
		System.out.printf("%s %d\n", POCARI, pocariArray.size());
	}
}
