package a_variable;

import java.util.Scanner;
// Ctrl + Shift + O

public class Variable {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * << 변수 >> 
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * 
		 * << 사용 가능한 기본형 데이터의 종류 >>
		 * - 정수 : byte(1), short(2), int(4), long(8)
		 * - 실수 : float(4), double(8)
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 * 
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지
		 *   그것의 이름이 무엇인지 알려줘야 한다.
		 *   
		 *  << 명명 규칙 >>
		 * - 블럭안에서 변수명은 중복될 수 없다.
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 *   (한글 사용은 자제하자)
		 * - 대소문자가 구분되며 길이에 제한이 없다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		 * - [여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.(상수는 언더바로 구분)]
		 * - [클래스명의 첫 글자는 대문자로 한다.]
		 * - [패키지명은 모두 소문자로 한다.]
		 */
		
		// 변수 선언 방법 : 데이터 타입 + 변수 이름
		byte abc = 0;
		char moonja = '1';
		
		System.out.println(abc);
		System.out.println(moonja);
		// 모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		byte b;
		short s;
		int n;
		long l;
		
		float f;
		double d;
		
		char c;
		
		boolean bl;
		
		// 선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		// 변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		// System.out.println(b); -> 컴파일 에러 발생(문법이 틀렸다)
		
		// = (대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		b = 127; // 타입에 맞는 값을 저장해야 한다.
		s = 30000;
		n = 20;
		l = 900L; // long 접미사 : L
		f = 3.14f; // float 접미사 : f
		d = 3.14; // double 접미사 : d(생략가능)
		c = 'b';
		bl = true;
		// 초기화 : 변수에 처음으로 값을 저장하는 것.
		
		System.out.println(n);
		// Ctrl + F11 : 프로그램 실행
		// F11 : 디버그 실행
		
		n = 30;
		System.out.println(n);
		n = 30 + 40;
		System.out.println(n);
		n = s;
		System.out.println(n);
		
		// 위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		
		b = 1;
		s = 2;
		n = 3;
		l = 4L;
		f = 5.0f;
		d = 6.0;
		c = '칠';
		bl = false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(n);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bl);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String str = new String("abcd");
		System.out.println(str);
		
		str = "1234";
		System.out.println(str);
		
		/*
		 * << 리터럴의 종류 >>
		 * - 숫자 : 0, 10, -5, 3.14
		 * - 문자 : '가', 'a', '0', ' '
		 * - 문자열 : "가나다", "abc", "123", "   ", ""
		 * - 그 외 : true, false, null
		 * 
		 * << 참조형 타입 >>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스 등)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		 */
		
		// 기본값 : 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값.
		b = 0;
		s = 0;
		n = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		c = '\u0000'; // => ' '
		bl = false;
		str = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		b = 127;
		n = 128;
		b = (byte)n; // 형변환 : 데이터 타입을 변환하는 것
		
		System.out.println(b); // 128 -> -128 (오버플로우)
		
		b = -128;
		n = -129;
		b = (byte)n;
		System.out.println(b); // -129 -> 127 (언더플로우)
		// 표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우
		// 데이터가 손실될 수 있다.
		
		d = 3.14;
		n = (int)d;
		System.out.println(n); // int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		// 표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		// 그러므로 형변환을 생략할 수 있다.
		
		n = 3;
		f = 4F;
		d = 6.5;

		// 위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요 (3번 이상)
		
		b = (byte)n;
		l = (long)d;
		n = (int)f;
		
		System.out.println(b);
		System.out.println(n);
		System.out.println(f);
		
		b = 1;
		n = 3;
		f = 5.5f;
		
		// 위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해주세요 (3번 이상)
		
		l = n;
		d = f;
		n = b;
		
		System.out.println(n);
		System.out.println(l);
		System.out.println(d);
		
		// 콘솔창에서 입력받는 방법
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("문자열을 입력해주세요 >> ");
//		String input1 = sc.nextLine();
//		System.out.println("입력 값 : " + input1);
//		
//		System.out.println("숫자를 입력해주세요 >> ");
//		int input2 = Integer.parseInt(sc.nextLine());
//		System.out.println("입력받은 숫자 : " + input2);
		
		// 문자열을 입력받고 입력받은 문자열을 출력해주세요.
	
		System.out.println("문자열을 입력해주세요 : ");
		String ip1 = sc.nextLine();
		System.out.println("입력한 문자 : " + ip1);
	
		// 숫자를 입력받고 입력받은 숫자를 출력해주세요.
		
		System.out.println("숫자를 입력해주세요 : ");
		int ip2 = Integer.parseInt(sc.nextLine());
		System.out.println("입력한 숫자 : " + ip2);
		
		// 위에서 입력받은 문자열과 숫자를 더해서 출력해주세요.
		
		System.out.println(ip1 + ip2);
		
		// 문자열과 다른 타입의 데이터를 더한 결과의 타입은 문자열이 된다.
		
		System.out.println(ip1 + (ip2 + 111));
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; 컴파일 에러 발생
	}
	
	

}
