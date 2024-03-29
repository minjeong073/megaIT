package academy.java1.condition;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 과락 포함 합격 여부");
		System.out.print("점수1 : ");
		int score1 = scan.nextInt();
		
		System.out.print("점수2 : ");
		int score2 = scan.nextInt();
		
		double average = (double) (score1 + score2) / 2;
		
		if (score1 > 50 && score2 > 50) {
			if (average >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("과락");
		}
		System.out.println();
		
		
		System.out.println("2. 윤년 구하기");
		System.out.print("연도 : ");
		int year = scan.nextInt();
		
		// 방법 1
		if ((year % 4 == 0 && year % 100 != 0)
				|| (year % 400 == 0 && year % 100 != 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년이 아니다");
		}
		
		// 방법 2
		if (year % 100 != 0 && (year % 4 == 0 || year % 400 == 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년이 아니다");
		}
		System.out.println();
		
		// 방법 3
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년");
				} else {
					System.out.println("윤년이 아니다");
				}
			} else {
				System.out.println("윤년");
			}
		} else {
			System.out.println("윤년이 아니다");
		}
		System.out.println();
		
		// 방법 4
		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if (year % 100 == 0) {
			System.out.println("윤년이 아니다");
		} else if (year % 4 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년이 아니다");
		}
		
		// 방법 5
		if (year % 400 == 0 
			|| (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년이 아니다");
		}
		System.out.println();
		
		
		System.out.println("3. 가위바위보 게임");
		System.out.print("영희 공격 : ");
		int num1 = scan.nextInt();
		
		System.out.print("철수 공격 : ");
		int num2 = scan.nextInt();
		
		// 방법 1
		switch (num1) {
		case 1:
			switch (num2) {
			case 1:
				System.out.println("비겼다");
				break;
			case 2:
			case 3:
				System.out.println("철수가 이겼다");
				break;
			default:
				System.out.println("잘못된 입력");
			}
			break;
		case 2:
			switch (num2) {
			case 1:
				System.out.println("영희가 이겼다");
				break;
			case 2:
				System.out.println("비겼다");
				break;
			case 3:
				System.out.println("철수가 이겼다");
				break;
			default:
				System.out.println("잘못된 입력");
			}
			break;
		case 3:
			switch (num2) {
			case 1:
			case 2:
				System.out.println("영희가 이겼다");
				break;
			case 3:
				System.out.println("비겼다");
				break;
			default:
				System.out.println("잘못된 입력");
			}
			break;
		default:
			System.out.println("잘못된 입력");
		}
		System.out.println();
		
		// 방법 2
		if ((num1 == 2 && num2 == 1) 
				|| (num1 == 3 && num2 == 1) 
				|| (num1 == 3 && num2 == 2)) {
			System.out.println("영희가 이겼다");
		} else if (num1 == num2) {
			System.out.println("비겼다");
		} else {
			System.out.println("철수가 이겼다");
		}
		System.out.println();
		
		
		System.out.println("4. 45분 전");
		System.out.print("시간 분 입력 : ");
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		// min < 45 : hour -1 , min + 15
		// min > 45 : min - 45
		// hour = 0 : hour = 23, min + 15
		
		// 방법 1
		if (min < 45) {
			if (hour == 0) {
				hour = 23;
				min += 15;
			} else {
				hour --;
				min += 15;
			}
		} else {
			min -= 45;
		}
		
		// 방법 2
		min -= 45;
		if (min < 0) {
			hour--;
			min += 60;
			
			if (hour < 0) {
				hour += 24;
			}
		}
		
		// 방법 3
		int total = hour * 60 + min;
		total -= 45;
		
		hour = total / 60;
		min = total % 60;
		
		if (min < 0) {
			hour = 24 - 1;
			min += 60;
		}
		
		System.out.println(hour + "시 " + min + "분");
		System.out.println();
		
		
		System.out.println("5. 윷놀이");
		System.out.println("윷 상태를 입력하세요 : ");
		int stick1 = scan.nextInt();
		int stick2 = scan.nextInt();
		int stick3 = scan.nextInt();
		int stick4 = scan.nextInt();
		
		int sum = stick1 + stick2 + stick3 + stick4;
		
		// 0, 1 입력하지 않은 경우
		if (stick1 > 1 || stick2 > 1 || stick3 > 1 || stick4 > 1
			|| stick1 < 0 || stick2 < 0 || stick3 < 0 || stick4 < 0) {
			System.out.println("잘못된 입력");
		} else {
			switch (sum) {
			case 0:
				System.out.println("모");
				break;
			case 1:
				System.out.println("도");
				break;
			case 2:
				System.out.println("개");
				break;
			case 3:
				System.out.println("걸");
				break;
			case 4:
				System.out.println("윷");
				break;
			}
		}
		
		// 방법 2
		int count = 0;
		
		if (stick1 == 1) {
			count ++;
		}
		if (stick2 == 1) {
			count ++;
		}
		if (stick3 == 1) {
			count ++;
		}
		if (stick4 == 1) {
			count ++;
		}
		
		switch (count) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		}
		
		scan.close();
		
	}

}
