package kr.co.mission.product;

import static kr.co.mission.util.Utils.*;
import static kr.co.mission.util.Variable.*;

import java.util.Scanner;

import kr.co.mission.User;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = null;
		int asset = 0;
		int pChoice = -1;
		
		do {
			if(user == null) {
				System.out.print("�ڻ��� �Է��ϼ��� : ");		
			} 			
			asset = scan.nextInt();			
			if(asset > 0) {
				user = new User(asset);
			}			
		}while(user == null);
		
		
		println("��ǰ��");
		println("-------------------------------------");
		for(int i=0; i<PRODUCT_LIST.length; i++) {
			System.out.printf("%d. %s\t%,d��\n", (i+1), PRODUCT_LIST[i], PRODUCT_PRICE_LIST[i]);
		}		
		println("-------------------------------------");
				
		do {
			Product p = null;	
			print("\n��ǰ�� ����ּ��� : ");
			pChoice = scan.nextInt();
			switch(pChoice) {
			case 1:
				p = new Tv(Tv.TV_13);
				break;
			case 2:
				p = new Tv(Tv.TV_15);
				break;
			case 3:
				p = new Tv(Tv.TV_20);
				break;
			case 4:
				p = new Dryer();
				break;
			case 5:
				p = new Car(Car.AVANTE);
				break;
			case 6:
				p = new Car(Car.SONATA);
				break;
			case 7:
				p = new Car(Car.GRANDURE);
				break;
			case 8:
				p = new Car(Car.GENESIS);
				break;			
			}
			if(p != null) {
				user.buyProduct(p);
			}
		}while(pChoice != 0 && user.getAsset() > 0);
		println("���α׷� ����");		
	}
}
