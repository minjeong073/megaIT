package academy.java1.condition;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("1. 음수 양수 판별");
		System.out.print("정수를 입력 하세요 : ");
		int number = scan.nextInt();

		if (number < 0) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("양수 입니다.");
		}

		System.out.println();


		System.out.println("2. 학점 출력");
		System.out.print("점수를 입력 하세요 : ");
		int score = scan.nextInt();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}
