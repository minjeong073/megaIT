package academy.array;

import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		System.out.println("1. 배열 값 접근");
		numbers[3] = 6;
		System.out.println();
		
		
		System.out.println("2. 배열 출력");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("3. 배열 출력");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("4. 배열 출력");
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 1) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("5. index");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 들어있는 index : " + i);
			}
		}
		System.out.println();
		
		
		System.out.println("6. 최대값");
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println();
		
		
		System.out.println("7. 최소값 index");
		int min = 10;
		int minIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
// 			if (numbers[i] < min) {
// 				min = numbers[i];
// 				minIndex = i;
// 			}
			
			// min 없이
			if (numbers[minIndex] > numbers[i]) {
				minIndex = i;
			}
		}
		System.out.println("최소값의 index : " + minIndex);
		System.out.println();
		
		
		System.out.println("8. 합계");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("값의 합 : " + sum);
		
		
	}
}
