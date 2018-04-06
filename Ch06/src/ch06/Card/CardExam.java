package ch06.Card;

import java.util.Random;

public class CardExam {
	public static void main(String[] args){
		//Object -> 모든 클래스의 부모. Card라는 객체도 여기서 상속받음.따라서 Object로 만들고 형 변환 가능
		Card All[] = new Card[52]; // 설계도를 만든 셈. 여기서는 널을 가리킴
		Random make_r = new Random();
		int overlap[] = new int[20];
		
		for(int i=0;i<All.length;i++)
		{
			All[i] = new Card(); // 설계도를 가지고 실제로 만든다~는 개념
			if(i < (All.length/4) )
				All[i].Collision("Clover",i + 1);
			else if(i >= (All.length/4) && i < (All.length/4)*2 )
				All[i].Collision("Diamond",i - (All.length/4) + 1);
			else if(i >= (All.length/4)*2 && i < (All.length/4)*3 )	
				All[i].Collision("Space", i - (All.length/4)*2 + 1);
			else
				All[i].Collision("Heart", i - (All.length/4)*3 + 1);
			
			//ll[i].printState();		
		}
		
		for(int i=0;i<overlap.length;i++)
		{
			overlap[i] = make_r.nextInt(All.length);
			for(int j=0;j<i;j++)
			{
				if(overlap[j]==overlap[i]) // 처음값부터 새로 들어온 값을 각각 비교(단, 처음엔 패스)
				{
					i--;
				}				
			}			
		}
		for(int i=0;i<overlap.length;i++)
		{
			All[overlap[i]].printState();
		}
		
		/*
		System.out.println("\n\n/////////////////////////////////\n");
		Card Arr[][] = new Card[4][13];
		Card c;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				c = new Card();
				c.setNumber(j+1);
				
				switch(i) {
				case 0:
					c.setShape("Clover");
					break;
				case 1:
					c.setShape("Diamond");
					break;
				case 2:
					c.setShape("Space");
					break;
				case 3:
					c.setShape("Heart");
					break;
				}
				Arr[i][j] = c;
				Arr[i][j].printState();
			}
		}
		*/
	}
}
