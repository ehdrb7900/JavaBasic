import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// - 삽입정렬 : 두 번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고
		// 중간에 삽입하는 방식
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		shuffle(numbers);

		System.out.println(Arrays.toString(numbers));

		insertSort(numbers);

	}

	private static void insertSort(int[] numbers) {

		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i], j = 0;
			for (j = i - 1; j >= 0; j--) {
				if (numbers[j] > temp) {
					numbers[j + 1] = numbers[j];
				} else {
					
					break;
				}
			}
			numbers[j + 1] = temp;
		}
		System.out.println("삽입 정렬:" + Arrays.toString(numbers));
	}

	private static void shuffle(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int random = (int) (Math.random() * numbers.length);

			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
	}
}
