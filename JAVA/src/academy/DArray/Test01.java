package academy.DArray;

public class Test01 {
	public static void main(String[] args) {
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		System.out.println("1. 학생 별 평균 구하기");
		
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double average = 0;
			
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			average = sum / 10.0;
			System.out.println((i + 1) + "번째 학생의 평균 : " + average);
		}
		System.out.println();
		
		
		System.out.println("2. 학생 별 최고점 구하기");
		for (int i = 0; i < scores.length; i++) {
			int maxScore = 0;
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] > maxScore) {
					maxScore = scores[i][j];
				}
			}
			System.out.println((i + 1) + "번째 학생의 최고점 : " + maxScore);
		}
		System.out.println();
		
		
		System.out.println("3. 평균 최고점 구하기");
		double maxAverage = 0;
		int index = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double average = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			average = sum / 10.0;
			if (average > maxAverage) {
				maxAverage = average;
				index = (i + 1);
			}
		}
		System.out.println("평균이 가장 높은 학생 : " + index + "번째 학생");
		System.out.println("평균 : " + maxAverage);
		System.out.println();
		
		
		System.out.println("4. 특정 과목 최고점");
		int maxScore = 0;
		index = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i][4] > maxScore) {
				maxScore = scores[i][4];
				index = (i + 1);
			}
		}
		System.out.println("4번째 과목의 최고 성적자는 " + index + "번째 학생");
		System.out.println("점수 : " + maxScore);
		System.out.println();
		
		
		System.out.println("5. 일부 평균 최고점");
		maxAverage = 0;
		index = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double average = 0;
			for (int j = 3; j <= 7; j++) {
				sum += scores[i][j];
			}
			average = sum / 5.0;
			if (average > maxAverage) {
				maxAverage = average;
				index = i;
			}
		}
		System.out.println("평균이 가장 높은 학생 : " + index + "번 index");
		System.out.printf("평균 : %.1f", maxAverage);
		
	}
}
