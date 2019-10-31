package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * << 객체지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라
		 * 	 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * << 객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환.
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고,
		 * 	 여러개의 객체가 동시에 존재할 수 있다.
		 */
		
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(10);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.test1();
		
		ClassMaker cm = new ClassMaker();
		cm.method01();
		System.out.println("2번 메소드 리턴 값 : " + cm.method02());
		cm.method03(50);
		System.out.println("4번 메소드 리턴 값 : " + cm.method04(20, 30));
		
		Calculator cal = new Calculator(); // 괄호가 있으면 메소드;
		double num = cal.sum(123456, 654321);
		
		System.out.println((int)num);
		num = cal.multiply(num, 123456);
		System.out.println((long)num);
		num = cal.divide(num, 123456);
		System.out.println((int)num);
		num = cal.subtract(num, 654321);
		System.out.println((int)num);
		num = cal.remainder(num, 123456);
		System.out.println((int)num);
		
		
		
	}

}
