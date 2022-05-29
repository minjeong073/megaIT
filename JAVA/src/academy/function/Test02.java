package academy.function;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 합 구하기");
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(sum(num));
		System.out.println();
		
		
		System.out.println("2. 최솟값");
		mininum();
		System.out.println();
		
		System.out.println("3. 소수(isPrime) 판별");
		System.out.print("수를 입력하세요 : ");
		num = scan.nextInt();
		System.out.println(isPrime(num));
    
	}

	public static int sum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (sum > 100) {
//				break;
				// 어차피 끝나고 sum 을 return 해야하기 때문에
				// 굳이 break 할 필요 없음
				return sum;
			}
		}	
		return sum;
	}
	
	public static void mininum() {
		int min = 1001;
		Scanner scan = new Scanner(System.in);
		System.out.print("5개의 수를 입력하세요 : ");
		for (int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			if (num < min) {
				min = num;
			}
		}
		System.out.println("최솟값은 " + min);
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
