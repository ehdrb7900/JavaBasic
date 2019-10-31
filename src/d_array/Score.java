package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, JQuery,JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름		JAVA	Oracle	HTML	JQuery	JSP		총점		평균
		 * 1	오동규	100		100		100		100		100		100		100
		 * 2	오동규	100		100		100		100		100		100		100
		 * 3	오동규	100		100		100		100		100		100		100
		 * 4	오동규	100		100		100		100		100		100		100
		 * 5	오동규	100		100		100		100		100		100		100
		 * ...
		 */
		
		String[][] classScore = new String[26][9];
		classScore[0][0] = "석차 ";
		classScore[0][1] = "이름 ";
		classScore[0][2] = "JAVA";
		classScore[0][3] = "Oracle"; 
		classScore[0][4] = "HTML";
		classScore[0][5] = "JQuery";
		classScore[0][6] = "JSP";
		classScore[0][7] = "총점";
		classScore[0][8] = "평균";
		classScore[1][1] = "오동규";
		classScore[2][1] = "박재욱";
		classScore[3][1] = "오제민";
		classScore[4][1] = "전보영";
		classScore[5][1] = "유지상";
		classScore[6][1] = "박신규";
		classScore[7][1] = "진주호";
		classScore[8][1] = "지원희";
		classScore[9][1] = "한승희";
		classScore[10][1] = "안정현";
		classScore[11][1] = "이이슬";
		classScore[12][1] = "이정은";
		classScore[13][1] = "이선욱";
		classScore[14][1] = "조건희";
		classScore[15][1] = "최효은";
		classScore[16][1] = "김혜정";
		classScore[17][1] = "김명성";
		classScore[18][1] = "신유진";
		classScore[19][1] = "조윤호";
		classScore[20][1] = "조아라";
		classScore[21][1] = "백운영";
		classScore[22][1] = "최도혁";
		classScore[23][1] = "김영호";
		classScore[24][1] = "박희제";
		classScore[25][1] = "현솔비";
		
		int sum[] = new int[25];
		double avg[] = new double[25];
		
		for(int i = 1; i < classScore.length; i++){
			for(int j = 2; j < classScore[i].length - 2; j++){
				classScore[i][j] = Integer.toString((int)(Math.random() * 50) + 50);
				sum[i-1] += Integer.parseInt(classScore[i][j]);
			}
			
			classScore[i][7] = Integer.toString(sum[i-1]);
			avg[i-1] = sum[i-1] / (double)classScore[i].length;
			classScore[i][8] = Double.toString((double)(int)(avg[i-1] * 10 + 0.5) / 10);
		}
		
		int[] rank = new int[classScore.length - 1];
		
		for (int i = 1; i < classScore.length; i++) {
			rank[i-1]++;
			
			for (int j = 1; j < classScore.length; j++) {
				if (Integer.parseInt(classScore[i][7]) < Integer.parseInt(classScore[j][7])) {
					rank[i-1]++;
				}
			}
			
			classScore[i][0] = Integer.toString(rank[i-1]);
		}
		
		for(int i = 0; i < classScore.length; i++){	
			for(int j = 0; j < classScore[i].length; j++){
				System.out.print(classScore[i][j] + "\t");
				
			}
			System.out.println();
		}
		
	}

}
