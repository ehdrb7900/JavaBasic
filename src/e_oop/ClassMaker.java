package e_oop;

public class ClassMaker {
	int n = 10;
	
	void method01(){
		System.out.println("전역변수 : " + n);
	}
	
	int method02(){
		return n;
	}
	
	void method03(int a){
		System.out.println("파라미터 : " + a);
	}
	
	int method04(int a, int b){
		return a * b;
	}
}
