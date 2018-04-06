package kr.co.koreait;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DrinkMachine machine = new DrinkMachine();
		Scanner scan = new Scanner(System.in);
		System.out.println("[자판기 시작]");
		Money.showMoneyList();
		
		int choiceIdx = 0;
		while(true) {
			System.out.print("입금 선택 : ");
			choiceIdx = scan.nextInt();
			if(choiceIdx == 6) {
				break;
			}
			switch(choiceIdx) {
			case 1:
				machine.addMoney(Money.money100);
				break;
			case 2:
				machine.addMoney(Money.money500);
				break;
			case 3:
				machine.addMoney(Money.money1000);
				break;
			case 4:
				machine.addMoney(Money.money5000);
				break;
			case 5:
				machine.addMoney(Money.money10000);
				break;
			}
			System.out.printf("입금액 : %,d\n", machine.getMoney());
		}
		
		machine.showMenu();
		while(true) {
			System.out.print("메뉴 선택 : ");
			choiceIdx = scan.nextInt();
			if(choiceIdx == 5) {
				break;
			}
			switch(choiceIdx) {
			case 1:
			case 2:
			case 3:
			case 4:
				machine.buyMenu(choiceIdx);
				machine.displayChange();
				break;
			}
			
		}
		
		machine.displayAmount();
	}
}
