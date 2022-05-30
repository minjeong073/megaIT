package academy.array;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

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
		
		printArray(numbers);
		System.out.println();
		
		
		System.out.println("2. 셔플");
		/*
		다만 제가 반복문을 100번 반복한 이유는 좀더 많은 횟수를
		섞기위해서 만들어 놓은 틀이에요.
		i가 꼭 index에서만 사용될 필요는 없습니다

		셔플이라는 특성을 잘 고민해 보시고 반복횟수를 늘려서
		다 많이 섞일 수 있도록 고민해 보면 좋을 것 같아요!!
		 */
		Random rand = new Random();
		
		int[] randomArray = new int[10];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (i + 1);
		}

//		for (int i = 0; i < 100; i++) {
//			int randomNum = rand.nextInt(10);
//			for (int j = 0; j < 10; j++) {
//				tmp = randomArray[j];
//				randomArray[j] = randomArray[randomNum];
//				randomArray[randomNum] = tmp;
//			}
//		}

		for (int i = 0; i < 100; i++) {
			int randomNum = rand.nextInt(10);
			tmp = randomArray[0];
			randomArray[0] = randomArray[randomNum];
			randomArray[randomNum] = tmp;
		}

		
		printArray(randomArray);
		System.out.println();
		
		
		System.out.println("3. 없는 수 찾기");
		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};

		boolean[] numbers2Check = new boolean[9];

		for (int i = 0; i < numbers2.length; i++) {
			numbers2Check[numbers2[i] - 1] = true;
		}

		for (int i = 1; i < numbers2Check.length; i++) {
			if (!numbers2Check[i]) {
				System.out.println("없는 수는 " + (i + 1) + " 입니다");
				break;
			}
		}
		System.out.println();


		System.out.println("4. 빈도수 구하기");
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};

		int[] numbers3Check = new int[5];

		for (int i = 0; i < numbers3.length; i++) {
			numbers3Check[numbers3[i] - 1] ++;
		}

		for (int i = 0; i < numbers3Check.length; i++) {
			System.out.println((i + 1) + " : " + numbers3Check[i]);
		}

	}
}
