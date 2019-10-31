

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String qNum = "q1";
		String result = "";
		
		String q1 = "나는 금사빠다.(금방 사랑에 빠진다)";
		String q2 = "연애할 때 끌려다니는 타입이다.";
		String q3 = "데이트 코스는 미리 짜는게 편하다.";
		String q4 = "감정기복이 크지 않다.";
		String q5 = "감정 표현에 솔직한 편이다.";
		String q6 = "활동적인 데이트가 좋다.";
		String q7 = "연락이 없어도 믿고 기다리는 편이다.";
		String q8 = "이성친구는 존재할 수 없다.";
		String q9 = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.";
		
		String q = q1;
		
		String wrong = "잘못 입력하셨습니다.";
		
		String a1 = "서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!";
		String a2 = "구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!";
		String a3 = "이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!";
		String a4 = "무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!";
		
		System.out.println("질문이 본인에게 해당되면 Y, 아니라면 N을 입력해주세요.");
		
		
		while (!qNum.equals("q0")){
			System.out.println(q);
			String answer = sc.nextLine();
			switch(qNum){
			case "q1":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q2";
					q = q2;
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q4";
					q = q4;
				} else {
					System.out.println(wrong);
				} break;
			case "q2":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q5";
					q = q5;
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q3";
					q = q3;
				} else {
					System.out.println(wrong);
				} break;
			case "q3":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q6";
					q = q6;
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q5";
					q = q5;
				} else {
					System.out.println(wrong);
				} break;
			case "q4":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q7";
					q = q7;
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q5";
					q = q5;
				} else {
					System.out.println(wrong);
				} break;
			case "q5":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q8";
					q = q8;
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q6";
					q = q6;
				} else {
					System.out.println(wrong);
				} break;
			case "q6":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q8";
					q = q8;
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q9";
					q = q9;
				} else {
					System.out.println(wrong);
				} break;
			case "q7":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q0";
					q = "";
					result = a1;
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q8";
					q = q8;
				} else {
					System.out.println(wrong);
				} break;
			case "q8":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q9";
					q = q9;
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q0";
					q = "";
					result = a2;
				} else {
					System.out.println(wrong);
				} break;
			case "q9":
				if(answer.equals("Y") || answer.equals("y")){
					qNum = "q0";
					result = a4;
					q = "";
				} else if(answer.equals("N") || answer.equals("n")) {
					qNum = "q0";
					result = a3;
					q = "";
				} else {
					System.out.println(wrong);
				} break;
						
			}
		}
		System.out.println(result);
	}

}
