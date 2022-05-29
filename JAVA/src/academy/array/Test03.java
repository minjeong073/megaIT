package academy.array;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 위치 변경 (swap)");
		int[] numbers = {3, 5, 2, 10, 39};
		
		System.out.print("두 개의 index를 입력 하세요 : ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		
		int tmp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = tmp;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("2. 셔플");
		Random rand = new Random();
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}
		
		for (int i = 0; i < 10; i++) {
			int randomNumber = rand.nextInt(10);
			tmp = arr[i];
			arr[i] = arr[randomNumber];
			arr[randomNumber] = tmp; 
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("3. 없는 수 찾기");
		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};

		boolean[] numbers2Check = new boolean[10];

		for (int i = 0; i < numbers2.length; i++) {
			numbers2Check[numbers2[i]] = true;
		}

		for (int i = 1; i < numbers2Check.length; i++) {
			if (!numbers2Check[i]) {
				System.out.println("없는 수는 " + i + " 입니다");
			}
		}
		System.out.println();

		System.out.println("4. 빈도수 구하기");
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};

		int[] numbers3Check = new int[6];

		for (int i = 0; i < numbers3.length; i++) {
			numbers3Check[numbers3[i]] ++;
		}

		for (int i = 1; i < numbers3Check.length; i++) {
			System.out.println(i + " : " + numbers3Check[i]);
		}

	}
}