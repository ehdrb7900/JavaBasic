package i_collection;

import java.util.ArrayList;
import java.util.Arrays;

import d_array.Array;

public class ArrayListClass {

	public static void main(String[] args) {
/*		
		 * add()		: 마지막 위치에 객체를 추가
		 * get()		: 지정된 위치의 객체를 반환
		 * set()		: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove()		: 지정된 위치의 객체를 제거
		 * size()		: 저장된 객체의 수 반환
		 
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
		list2.remove(0);
		// 리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>(); // 2차원 배열
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(10);
		
		list3.add(list4);
		
		list4 = new ArrayList<Integer>();
		list4.add(20);
		
		list3.add(list4);
		
		// 정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++){
			list5.add(10 * (i + 1));
		}
		
		System.out.println(list5);
		
		// 위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < list5.size(); i++){
			sum += list5.get(i);
		}
		
		avg = sum / (double)list5.size();
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		// 위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력해주세요.
		int max = list5.get(0);
		int min = list5.get(0);
		
		for(int i = 1; i < list5.size(); i++){
			if(max < list5.get(i)){
				max = list5.get(i);
			}
			
			if(min > list5.get(i)){
				min = list5.get(i);
			}
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);*/
		
		
		// d_array 패키지의 Score 클래스 구현
		ArrayList<String> studentName = new ArrayList<String>();
		ArrayList<String> subjectName = new ArrayList<String>();
		ArrayList<ArrayList<Double>> score = new ArrayList<ArrayList<Double>>();
		
		String[] students = {
				"오동규", "박재욱", "오제민", "전보영", "유지상", "박신규", "진주호", "지원희", "한승희", "안정현", "이이슬", "이정은", "이선욱", "조건희", "최효은", "김혜정", "신유진", "조윤호", "조아라", "백운영", "최도혁", "김영호", "박희제", "현솔비"
		};
		
		String[] subject = {
				"석차", "이름", "JAVA", "Oracle", "HTML", "JQuery", "JSP", "총점", "평균"
		};
		
		for(int i = 0; i < students.length; i++){	// 학생, 과목 ArrayList에 저장
			if(i < subject.length)
				subjectName.add(subject[i]);
			
			studentName.add(students[i]);
		}
		
		for(int i = 0; i < students.length; i++){	// 과목별 점수 및 합계, 평균 score에 저장
			int sumScore = 0;
			double avgScore = 0;
			
			ArrayList<Double> mkScore = new ArrayList<Double>();
			
			for(int j = 0; j < 5; j++){
				double subScore = (double)((int)(Math.random()*101));
				mkScore.add(subScore);
				sumScore += subScore;
			}
			
			avgScore = sumScore / 5.0;
			mkScore.add((double)sumScore);
			mkScore.add(avgScore);
			
			score.add(mkScore);
		}
		
		int[] rank = new int[students.length];
		
		for(int i = 0; i < score.size(); i++){
			rank[i]++;
			
			for(int j = 0; j < score.size(); j++){
				if(score.get(j).get(5) > score.get(i).get(5)){
					rank[i]++;
				}
			}
		}
		
		for(int i = 0; i < students.length + 1; i++){
			if(i == 0){
				for(int j = 0; j < subject.length; j++){
					System.out.print(subject[j] + "\t");
				}
			}else{
				System.out.print(rank[i-1] + "\t");
				System.out.print(students[i-1] + "\t");
				
				for(int j = 0; j < score.get(i-1).size(); j++){
					System.out.print(score.get(i-1).get(j) + "\t");
				}
			}
			System.out.println();
		}
	}
}
