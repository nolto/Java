package kr.co.mission;

import static kr.co.mission.util.Utils.print;
import static kr.co.mission.util.Utils.println;
import static kr.co.mission.util.Variable.PRODUCT_LIST;
import static kr.co.mission.util.Variable.PRODUCT_PRICE_LIST;

import java.util.Scanner;

import kr.co.mission.product.Car;
import kr.co.mission.product.Dryer;
import kr.co.mission.product.Product;
import kr.co.mission.product.Tv;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = null;
		int asset = 0;
		int pChoice = -1;

		do {
			if(user == null) {
				System.out.print("자산을 입력하세요 : ");		
			} 			
			asset = scan.nextInt();			
			if(asset > 0) {				// 빚은 받지 않음
				user = new User(asset);
			}			
		}while(user == null);

		println("제품들");
		println("-------------------------------------");
		for(int i=0; i<PRODUCT_LIST.length; i++) {
			System.out.printf("%d. %s\t%,d원\n", (i+1), PRODUCT_LIST[i], PRODUCT_PRICE_LIST[i]);
		}		
		println("-------------------------------------");

		do {
			Product p = null;	
			print("\n제품을 골라주세요 : ");
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
		println("프로그램 종료");		
	}
}