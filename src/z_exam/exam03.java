package z_exam;

public class exam03 {

	public static void main(String[] args) {
//		3장 연습문제
//
//		[3-1] 다음 연산의 결과를 적으시오.
//
//		class Exercise3_1 {
//			public static void main(String[] args) {
//				int x = 2;
//				int y = 5;
//				char c = 'A'; // 'A' 65 의 문자코드는
//
//				System.out.println(1 + x << 33);
//				System.out.println(y >= 5 || x < 0 && x > 2);
//				System.out.println(y += 10 - x++);
//				System.out.println(x+=2);
//				System.out.println( !('A' <= c && c <='Z') );
//				System.out.println('C'-c);
//				System.out.println('5'-'0');
//				System.out.println(c+1);
//				System.out.println(++c);
//				System.out.println(c++);
//				System.out.println(c);
//			}
//		}
//
//		[답] : 6, true, 13, 5, false, 2, 5, 66, B, B, C


//		[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
//		사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면 13개의 바구니 
//		가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
		
//		class Exercise3_2 {
//			public static void main(String[] args) {
//				int numOfApples = 123; // 사과의 개수
//				int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
//				int numOfBucket = ( /* (1) */ ); // 모든 사과를 담는데 필요한 바구니의 수
//				System.out.println(" :"+numOfBucket); 필요한 바구니의 수
//			}
//		}
		
//		실행결과 = 13
		
//		[답] = (numOfApples % sizeOfBucket == 0) ? (numOfApples / sizeOfBucket) : ((numOfApples / sizeOfBucket) + 1) 


//		[3-3] 아래는 변수 의 값에 따라 num ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다 삼항 연산 .
//		자를 이용해서 (1)에 알맞은 코드를 넣으시오.
//		[Hint] 삼항 연산자를 두 번 사용하라.
		

//		class Exercise3_3 {
//			public static void main(String[] args) {
//				int num = 10;
//				System.out.println( /* (1) */ );
//			}
//		}
		
//		실행결과 = 양수
		
//		[답] = num > 0 ? "양수" : (num == 0 ? "0" : "음수")
		
		
//		[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다, 만일 변수 num
//		의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으  
//		시오.

//		class Exercise3_4 {
//			public static void main(String[] args) {
//				int num = 456;
//				System.out.println( /* (1) */ );
//			}
//		}
		
//		실행결과 = 400
		
//		[답] = num / 100 * 100
		
		
//		[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의    
//		값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.

//		class Exercise3_5 {
//			public static void main(String[] args) {
//				int num = 333;
//				System.out.println( /* (1) */ );
//			}
//		}
		
//		실행결과 = 331
		
//		[답] = num / 10 * 10 + 1
		
		
//		[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
//		뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
//		다. 19의 경우 20이고 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
//		수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
		
//		[Hint] 나머지 연산자를 사용하라.

//		class Exercise3_6 {
//			public static void main(String[] args) {
//				int num = 24;
//				System.out.println( /* (1) */ );
//			}
//		}
		
//		실행결과 = 6
//
//		[답] = 10 - (num % 10)
		
//		[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
//		5/9 ×(F - 32)'라고 할 때, (1) 에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
//		셋째자리에서 반올림해야한다. (Math.round()를 사용하지 않고 처리할 것)

//		class Exercise3_7 {
//			public static void main(String[] args) {
//				int fahrenheit = 100;
//				float celcius = ( /* (1) */ );
//				System.out.println("Fahrenheit:"+fahrenheit);
//				System.out.println("Celcius:"+celcius);
//			}
//		}
//	
//		실행결과 = Fahrenheit:100
//				  Celcius:37.78
//		
//		[답] = (int)(5/9f × (fahrenheit - 32) * 100 + 0.5) / 100.0f

//

//		[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.

//		class Exercise3_8 {
//			public static void main(String[] args) {
//				byte a = 10;
//				byte b = 20;
//				byte c = a + b;					->  int c = a + b;
//				char ch = 'A';
//				ch = ch + 2;					->	ch = (char) (ch + 2);
//				float f = 3 / 2;				->	float f = 3 / 2f;
//				long l = 3000 * 3000 * 3000;	->	long l = 3000 * 3000 * 3000L;
//				float f2 = 0.1f;
//				double d = 0.1;
//				boolean result = d==f2;			-> boolean result = (float)d == f2;
//				System.out.println("c="+c);
//				System.out.println("ch="+ch);
//				System.out.println("f="+f);
//				System.out.println("l="+l);
//				System.out.println("result="+result);
//			}
//		}
		
//		실행결과 = 
//		c=30
//		ch=C
//		f=1.5
//		l=27000000000
//		result=true
//
		
//		[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
//		의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.

//		class Exercise3_9 {
//			public static void main(String[] args) {
//				char ch = 'z';
//				boolean b = ( /* (1) */ );
//				System.out.println(b);
//			}
//		}

//
//		실행결과 = true
//		
//
//		[답] = ('A' <= ch <= 'Z' || 'a' <= ch <= 'z' || '0' <= ch <= '9')

//		[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
//		인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
//		들어 'A'의 코드는 65이고 'a'의 코드는 97이다 (1)~(2)에 알맞은 코드를 넣으시오.

//		class Exercise3_10 {
//			public static void main(String[] args) {
//				char ch = 'A';
//				char lowerCase = ( /* (1) */ ) ? ( /* (2) */ ) : ch;
//				System.out.println("ch:"+ch);
//				System.out.println("ch to lowerCase:"+lowerCase);
//			}
//		}
		
//		실행결과 = 
//		ch:A
//		ch to lowerCase:a
		
//		[답] = (1) : ('A' <= ch <= 'Z'), (2) : (char)(ch + 32)
		

	}
}
