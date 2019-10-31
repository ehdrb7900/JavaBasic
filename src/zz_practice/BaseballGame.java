package zz_practice;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
		 int hun = (int)(Math.random() * 9)+1; 
		 int ten = (int)(Math.random() * 9)+1; 
		 int one = (int)(Math.random() * 9)+1;
		  
		  int str = 0; int ball = 0; int out = 0;
		  
		  while (hun == ten) ten = (int)(Math.random() * 9)+1;
		  
		  while (hun == one || ten == one) one = (int)(Math.random() * 9)+1;
		  
		  System.out.println(
		  "숫자야구 게임을 시작합니다. \n 정답은 세 자리 숫자이고 각 자리수는 서로 겹치지 않으며 \n 모든 자리수에 0은 존재하지 않습니다."
		  ); System.out.println("세 자리 숫자를 입력해주세요.");
		  
		  Scanner s = new Scanner(System.in); int num = s.nextInt(); while (123
		  > num || 987 < num) { System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
		  num = s.nextInt(); }
		  
		  while(true){
		  
		  if(num / 100 == hun) str++; else if (num / 100 == ten || num / 100 ==
		  one) ball++;
		  
		  if(num % 100 / 10 == ten) str++; else if ( num % 100 / 10 == hun ||
		  num % 100 / 10 == one) ball++;
		  
		  if(num % 10 == one) str++; else if (num % 10 == hun || num % 10 ==
		  ten) ball++;
		  
		  if(str == 3) break;
		  
		  out = 3 - str - ball; System.out.println(str + "S" + ball + "B" + out
		  + "O"); System.out.println("세 자리 숫자를 입력해주세요.");
		  
		  num = s.nextInt();
		  
		  str = 0; ball = 0; out = 0;
		  
		 } System.out.println("정답입니다.");
		 
//		 int count = 0;
//		 for(int i=0; i<10; i++) {
//			 System.out.println(++count);
//		 }

//		int count = 0;
//		for (int i = 0; i < 10; i++) {
//			count++; // ++count; // count += 1;
//			System.out.println(count);	
//		}
		
	}
}