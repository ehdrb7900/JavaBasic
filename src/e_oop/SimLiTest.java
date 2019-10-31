package e_oop;

import java.util.Scanner;

public class SimLiTest {
	Scanner s = new Scanner(System.in);
	String ans;
	 // 9개의 질문을 9개의 메서드로 만들어주세요.	
	void start(){
		System.out.println("나는 금사빠다. (금방 사랑에 빠진다) [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q2();
		} else if (ans.equals("N") || ans.equals("n")){
			q4();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			start();
		}
	}
	
	void q2(){
		System.out.println("연애할 때 끌려다니는 타입이다. [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q5();
		} else if (ans.equals("N") || ans.equals("n")){
			q3();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			q2();
		}
	}
	
	void q3(){
		System.out.println("데이트 코스는 미리 짜는게 편하다. [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q6();
		} else if (ans.equals("N") || ans.equals("n")){
			q5();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			q3();
		}
	}
	
	void q4(){
		System.out.println("감정기복이 크지 않다. [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q7();
		} else if (ans.equals("N") || ans.equals("n")){
			q5();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			q4();
		}
	}
	
	void q5(){
		System.out.println("감정 표현에 솔직한 편이다. [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q8();
		} else if (ans.equals("N") || ans.equals("n")){
			q6();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			q5();
		}
	}
	
	void q6(){
		System.out.println("활동적인 데이트가 좋다. [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q8();
		} else if (ans.equals("N") || ans.equals("n")){
			q9();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			q6();
		}
	}
	
	void q7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다. [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			a1();
		} else if (ans.equals("N") || ans.equals("n")){
			q8();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			q7();
		}
	}
	
	void q8(){
		System.out.println("이성친구는 존재할 수 없다. [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q9();
		} else if (ans.equals("N") || ans.equals("n")){
			a2();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			q8();
		}
	}
	
	void q9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. [Y/N]");
		ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			a4();
		} else if (ans.equals("N") || ans.equals("n")){
			a3();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			q9();
		}
	}
	
	void a1(){
		System.out.println("서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
	}
	
	void a2(){
		System.out.println("구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
	}
	
	void a3(){
		System.out.println("이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
	}
	
	void a4(){
		System.out.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
	}
	
	public static void main(String[] args){
		
		SimLiTest sl = new SimLiTest();
		sl.start();
		
		
	}
	
}
