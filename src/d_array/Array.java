package d_array;

import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		/*
		 * << 배열 >> - int[] number = new int[5]; // 기본값으로 초기화된다. 
		 * - int number[] = new int[]{10, 20, 30, 40, 50}; 
		 * - int[] number = {10, 20, 30, 40, 50}; // 타입 뒤에 대괄호를 쓰는것이 일반적으로 사용된다.
		 */

		// 배열은 참조형 타입이다.
		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		// new : 새로운 저장공간 생성 및 주소 반환
		// int[5] : int를 저장할 수 있는 5개의 공간
		// 배열 초기화시 기본값이 저장된다.

		System.out.println(array); // [I@41649a55 => 주소가 저장되어 있다.

		System.out.println(array[0]); // 실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
										// index에는 int만 사용할 수 있다. (리터럴, 변수, 상수,
										// 연산 등)
										// 배열의 최대 크기는 int의 최대값 (약 20억)이다.

		String arrayStr = Arrays.toString(array); // 배열의 모든 인덱스에 저장된 값을 문자열로
													// 반환한다.
		System.out.println(arrayStr); // int의 기본값인 0이 저장되어있다.

		int[] iArray1 = new int[] { 1, 2, 3 }; // 값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = { 1, 2, 3 }; // 선언과 초기화를 동시에 해야한다.
		int[] iArray3;
		// iArray3 = {1, 2, 3}; // 선언과 초기화는 따로 실행하는 것이 불가능하다.

		array[0] = 10; // 인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; // 마지막 인덱스는 "배열의 길이 -1" 이다.

		// 정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화해주세요.

		int[] iArr = new int[10];

		// 모든 인덱스에 있는 값을 변경해주세요.
		for (int i = 1; i <= 10; i++) {
			iArr[i - 1] = i;
			System.out.println(iArr[i - 1]);
		}

		// 모든 인덱스에 있는 값을 더해주세요.
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum += iArr[i];
		}

		System.out.println(sum);

		// index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다.
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		// 배열의 길이를 알고있다고 리터럴을 사용하는 것을 하드코딩이라고 한다.
		// 길이를 알더라도 length를 사용하는 것이 더 좋은 코드이다.

		for (int i = 0; i < array.length; i++) {
			iArr[i] = i + 1;
		}
		System.out.println(Arrays.toString(iArr));

		// 배열의 숫자를 저장하고 합계와 평균을 구해주세요.
		int[] numbers = new int[10];
		sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) + 1;
			System.out.println("numbers[" + i + "] :" + numbers[i]);
			sum += numbers[i];
		}
		double avg = sum / numbers.length;
		System.out.println("합계 : " + sum + ", 평균 : " + avg);

		// 향상된 for문
		for (int number : numbers) { // 배열에 있는 값을 차례대로 변수에 넣는다. (배열 혹은 컬렉션에 사용)
			System.out.println(number);
		}

		for (int number : numbers) {
			number = 0; // numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));

		// 배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		// 배열의 값이 최소값보다 작으면 최소값에 배열의 값을 저장하고
		// 배열의 값이 최대값보다 크면 최대값에 배열의 값을 저장한다.

		int count = 0, min = 0, max = 0;
		for (int n : numbers) {
			if (count == 0) {
				min = n;
				max = n;
			} else if (min > n)
				min = n;
			else if (max < n)
				max = n;
			System.out.println("numbers[" + ++count + "] : " + n);
		}
		System.out.println("최소값 : " + min + ", 최대값 : " + max);

		int[] shuffle = new int[30];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));

		// 배열의 값을 섞어주세요.
		// 0번 인덱스의 값과 랜덤 인덱스의 값을 서로 교환한다.

		int switchNum = 0, ranNum = 0;
		for (int i = 0; i < shuffle.length; i++) {
			ranNum = (int) (Math.random() * shuffle.length);
			switchNum = shuffle[ranNum];
			shuffle[ranNum] = shuffle[i];
			shuffle[i] = switchNum;
		}
		System.out.println(Arrays.toString(shuffle));

		// 배열은 길이를 변경할 수 없기 때문에 길이가 부족할 경우
		// 더 큰 배열에 복사를 해야한다.
		int[] temp = new int[shuffle.length * 2];
		for (int i = 0; i < shuffle.length; i++) {
			temp[i] = shuffle[i];
		}
		shuffle = temp; // 주소값 대입;
		System.out.println(Arrays.toString(shuffle));

		// 배열 복사 메서드
		int[] originArray = new int[] { 1, 2, 3, 4, 5 };
		int[] copyArray = new int[originArray.length * 2];
		System.arraycopy(originArray, 0, copyArray, 0, originArray.length);
		System.out.println(Arrays.toString(copyArray));

		// 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] random = new int[500];
		int[] countNum = new int[10];
		for (int i = 0; i < 500; i++) {
			random[i] = (int) (Math.random() * 10) + 1;
			countNum[random[i]-1]++;
		}
		for (int i = 0; i < 10; i++){
			System.out.println(i+1 +" = " + countNum[i] + "개");
		}
	}
}
