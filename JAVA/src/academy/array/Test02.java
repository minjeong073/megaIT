package academy.array;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		int[] numbers = {3, 5, 2, 10, 39};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 배열 값 변경");
		System.out.print("변경할 index와 값을 입력하세요 : ");
		int index = scan.nextInt();
		int value = scan.nextInt();
		
		numbers[index] = value;
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("2. 점수 채점");
		char[] scores = {'X','O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		
		int score = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				score += 10;
			}
		}
		System.out.println("채점 결과는 " + score + "점 입니다.");
		System.out.println();
		
		
		System.out.println("3. 임금 계산");
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		
		int pay = 0;
		for (int i = 0; i < 5; i++) {
			pay += works[i] * 8500;
		}
		for (int i = 5; i < works.length; i++) {
			pay += works[i] * 9500;
		}
		System.out.println("일주일간 총 임금은 " + pay + "원 입니다.");
		System.out.println();
		
		
		System.out.println("4. 알파벳 순서");
		int num = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			num++;
		}
		char[] array = new char[num];
		
		int i = 0;
		for (char j = 'A'; j <= 'Z'; j++) {
			array[i] = j;
			i++;
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] == 'V') {
				System.out.println("V 는 " + (j + 1) + "번째 입니다.");
			}
		}
		System.out.println();
		
		
		System.out.println("5. 배열 값 변경");
		int[] arr = new int[5];
		
		i = 0;
		while (true) {
			System.out.print("수를 입력하세요 : ");
			num = scan.nextInt();
			if (num % 2 == 0) {
				arr[i] = num;
				i++;
			}
			if (i >= 5) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j] + " ");
				}
				break;
			}
		}

	}
}
