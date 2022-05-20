package academy.condition.test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 짝수 구하기");
		System.out.print("세개의 수를 입력 하세요 : ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println(num1 + "는 짝수 입니다.");
		}
		if (num2 % 2 == 0) {
			System.out.println(num2 + "는 짝수 입니다.");
		}
		if (num3 % 2 == 0) {
			System.out.println(num3 + "는 짝수 입니다.");
		}
		System.out.println();
		
		
		System.out.println("2. 비만도 구하기");
		System.out.print("bmi 수치를 입력하세요 : ");
		int bmi = scan.nextInt();
		
		if (bmi <= 10) {
			System.out.println("정상");
		} else if (bmi <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		System.out.println();
		
		
		System.out.println("3. 평균 합격 구하기");
		System.out.print("두 점수를 입력 하세요 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		
		double average = (double) (score1 + score2) / 2;
		
		if (average >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println();
		
		
		System.out.println("4. 큰 값 구하기");
		System.out.print("세 수를 입력 하세요 : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		// 방법 1
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("가장 큰 값 : " + num1);
			} else if (num1 < num3) {
				System.out.println("가장 큰 값 : " + num3);
			} else {
				System.out.println("첫번째 수와 세번째 수가 " + num1 
						+ " 으로 동일합니다.");
				System.out.println("가장 큰 값 : " + num1);
			}
		} else if (num1 < num2) {
			if (num2 > num3) {
				System.out.println("가장 큰 값 : " + num2);
			} else if (num2 < num3) {
				System.out.println("가장 큰 값 : " + num3);
			} else {
				System.out.println("두번째 수와 세번째 수가 " + num2 
						+ " 으로 동일합니다.");
				System.out.println("가장 큰 값 : " + num2);
			}
		} else {
			if (num1 > num3) {
				System.out.println("첫번째 수와 두번째 수가 " + num1 
						+ " 으로 동일합니다.");
				System.out.println("가장 큰 값 : " + num1);
			} else if (num1 < num3) {
				System.out.println("첫번째 수와 두번째 수가 " + num1 
						+ " 으로 동일합니다.");
				System.out.println("가장 큰 값 : " + num3);
			} else {
				System.out.println("세 개의 수가 " + num1 
						+ " 으로 동일합니다.");
				System.out.println("가장 큰 값 : " + num1);
			}
		}
		System.out.println();
		
		// 방법 2
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
		System.out.println();
		
		
		// 방법 3
		// max = 0 으로 한 경우 입력값이 음수가 되면 바뀌지 않음
		// -> 처음부터 max = num1
		int max = num1;
		
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println(max);
		System.out.println();
		
		
		System.out.println("5. 계절 구하기");
		System.out.print("월을 입력 하세요 : ");
		int month = scan.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된 입력 입니다.");
		}
		
		scan.close();
		
	}
}
