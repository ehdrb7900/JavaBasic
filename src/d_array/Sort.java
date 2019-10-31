package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * << 정렬 >> 
		 * - 선택정렬 : 첫 번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 
		 * 			자리 바꾸기를 반복해 앞에서부터 작은 수를 채워나가는 방식 
		 * - 버블정렬 : 첫 번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리 바꾸기를 반복해
		 * 			뒤에서부터 큰 수를 채워나가는 방식 
		 * - 삽입정렬 : 두 번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고
		 * 			중간에 삽입하는 방식 
		 * - 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩
		 * 			증가시키는 방식
		 */
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		shuffle(numbers);
		System.out.println("점수 : " + Arrays.toString(numbers));

		// printRank(numbers); // 석차구하기
		// selectSort(numbers); // 선택정렬
//		bubbleSort(numbers); // 버블정렬
		insertSort(numbers); // 삽입정렬
	}

	private static void insertSort(int[] numbers) {
		int tmp = 0;
		for (int i = 1; i < numbers.length; i++) {
			int j = 0;
			tmp = numbers[i];
			for (j = i - 1 ; j >= 0; j--){
				if (tmp < numbers[j]) {
					numbers[j + 1] = numbers[j];
				}else{
					break;
				}
			}
			numbers[j + 1] = tmp;
		}
		System.out.println("삽입 정렬 : " + Arrays.toString(numbers));
	}

	private static void bubbleSort(int[] numbers) {
		int tmp = 0;
		for (int i = 1; i < numbers.length; i++) {
			boolean changed = false;
			for (int j = 0; j < numbers.length - i; j++){
				if (numbers[j] >= numbers[j+1]) {
					tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed)
				break;
		}
		System.out.println("버블 정렬 : " + Arrays.toString(numbers));
	}

	private static void selectSort(int[] numbers) {
		int tmp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		System.out.println("선택정렬 : " + Arrays.toString(numbers));
	}

	private static void printRank(int[] numbers) {
		int[] rank = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			rank[i]++;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("등수 : " + Arrays.toString(rank));
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
