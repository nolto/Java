package ch07;

import java.text.DecimalFormat;//// 콤마 표시
import java.util.Scanner;

public class Mission_Purchase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		purchase_product Menu[] = new purchase_product[20];
		System.out.print("자산을 입력하세요 : ");
		String input = scanner.nextLine();
		DecimalFormat df = new DecimalFormat("#,##0");
		value data = new value();
		
		int money = Integer.parseInt(input);		// 재산
		int select;
		int i=0;			// 구매한 제품 수 카운트
		int sum=0;			// 구매한 제품들 가격 카운트
		int temp;
		Mission_Purchase.display_menu(data,df);	// 전체메뉴 출력
		
		while(true) {
			System.out.print("제품을 골라주세요 : ");
			input = scanner.nextLine();
			select = Integer.parseInt(input);

			if(select==1) {
				temp = Mission_Purchase.logic(money, data.TV_13_PRICE,df);
				if(temp !=-1) {
					money=temp;
					Menu[i] = new purchase_product(data.TV_13_NAME,data.TV_13_PRICE);
					i++;
				}
			}
			else if(select==2) {
				temp = Mission_Purchase.logic(money, data.TV_15_PRICE,df);
				if(temp !=-1) {
					money=temp;
					Menu[i] = new purchase_product(data.TV_15_NAME,data.TV_15_PRICE);
					i++;
				}
			}
			else if(select==3) {
				temp = Mission_Purchase.logic(money, data.TV_20_PRICE,df);
				if(temp !=-1) {
					money=temp;
					Menu[i] = new purchase_product(data.TV_20_NAME,data.TV_20_PRICE);
					i++;
				}
			}
			else if(select==4) {
				temp = Mission_Purchase.logic(money, data.DRY_PRICE,df);
				if(temp !=-1) {
					money=temp;
					Menu[i] = new purchase_product(data.DRY_NAME,data.DRY_PRICE);
					i++;
				}
			}
			else if(select==5) {
				temp = Mission_Purchase.logic(money, data.AVANTE_PRICE,df);
				if(temp !=-1) {
					money=temp;
					Menu[i] = new purchase_product(data.AVANTE_NAME,data.AVANTE_PRICE);
					i++;
				}
			}
			else if(select==6) {
				temp = Mission_Purchase.logic(money, data.SONATA_PRICE,df);
				if(temp !=-1) {
					money=temp;
					Menu[i] = new purchase_product(data.SONATA_NAME,data.SONATA_PRICE);
					i++;
				}
			}
			else if(select==7) {
				temp = Mission_Purchase.logic(money, data.GRANDEUR_PRICE,df);
				if(temp !=-1) {
					money=temp;
					Menu[i] = new purchase_product(data.GRANDEUR_NAME,data.GRANDEUR_PRICE);					
					i++;
				}
			}
			else if(select==8) {
				temp = Mission_Purchase.logic(money, data.GENESIS_PRICE,df);
				if(temp !=-1) {
					money=temp;
					Menu[i] = new purchase_product(data.GENESIS_NAME,data.GENESIS_PRICE);
					i++;
				}
			}
			else if(select==0) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("잘못된 입력");
				continue;
			}
			
			System.out.println("나의 제품들");
			System.out.println("======================================");
			sum=0;				// 구매한 제품 가격 합계 초기화
			for(int j=0;j<i;j++) {
				Menu[j].print();
				sum+=Menu[j].getPrice();
			}
			System.out.println("======================================");
			System.out.println("총 비용: "+df.format(sum)+"원");
			System.out.println("남은 돈: "+df.format(money)+"원");
			
		}
	}
	static void display_menu(value data,DecimalFormat df) {		
		System.out.println("--------------------------------------");
		System.out.println("1. "+data.TV_13_NAME+" "+df.format(data.TV_13_PRICE));
		System.out.println("2. "+data.TV_15_NAME+" "+df.format(data.TV_15_PRICE));
		System.out.println("3. "+data.TV_20_NAME+" "+df.format(data.TV_20_PRICE));
		System.out.println("4. "+data.DRY_NAME+" "+df.format(data.DRY_PRICE));
		System.out.println("5. "+data.AVANTE_NAME+" "+df.format(data.AVANTE_PRICE));
		System.out.println("6. "+data.SONATA_NAME+" "+df.format(data.SONATA_PRICE));
		System.out.println("7. "+data.GRANDEUR_NAME+" "+df.format(data.GRANDEUR_PRICE));
		System.out.println("8. "+data.GENESIS_NAME+" "+df.format(data.GENESIS_PRICE));
		System.out.println("--------------------------------------");
	}
	static int logic(int money,int price, DecimalFormat df) {
		if(money>=price) {
			money-=price;
			return money;
		}
		else {
			System.out.println("금액이 부족합니다.(현재금액: "+df.format(money)+"원)");
			return -1;
		}
	}
}

class purchase_product{
	private String product_name;
	private int price;
	
	DecimalFormat df = new DecimalFormat("#,##0");
	
	purchase_product(String name, int price){
		this.product_name=name;
		this.price=price;
	}
	
	void print(){
		System.out.println(product_name +" "+df.format(price)+"원");
	}

	public int getPrice() {
		return price;
	}
}

class value{
	public final int TV_13_PRICE		= 1500;
	public final int TV_15_PRICE		= 2000;
	public final int TV_20_PRICE		= 4000;
	public final int DRY_PRICE			= 500;
	public final int AVANTE_PRICE		= 10000;
	public final int SONATA_PRICE		= 20000;
	public final int GRANDEUR_PRICE		= 40000;
	public final int GENESIS_PRICE		= 60000;
	
	public final String TV_13_NAME		= "TV 13인치";
	public final String TV_15_NAME		= "TV 15인치";
	public final String TV_20_NAME		= "TV 20인치";
	public final String DRY_NAME		= "드라이기";
	public final String AVANTE_NAME		= "아반떼";
	public final String SONATA_NAME		= "소나타";
	public final String GRANDEUR_NAME	= "그랜저";
	public final String GENESIS_NAME	= "제네시스";
}