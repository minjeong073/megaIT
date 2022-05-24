package academy.function;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 2의 제곱 함수");
		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		System.out.println(num + "의 제곱은 " + getSquared(num) + "이다.");
		System.out.println();
		
		System.out.println("2. 평균 구하기 함수");
		System.out.print("점수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		
		double average = getAverage(num1, num2, num3, num4);
		System.out.println("평균은 " + average);
		System.out.println();
		
		System.out.println("3. 몫과 나머지 출력 함수");
		System.out.print("숫자와 나눌 수를 입력하세요 : ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		printQuotientRemainder(num1, num2);
		System.out.println();
		
		System.out.println("4. 홀짝 함수");
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		System.out.println(oddEven(num));
		
	}
	
	public static int getSquared(int num) {
		return num*num;
//		return (int) Math.pow(num, 2);
	}
	
	public static double getAverage(int num1, int num2, int num3, int num4) {
		int sum = num1 + num2 + num3 + num4;
		
		return sum / 4.0;
	}
	
	
	public static void printQuotientRemainder(int num1, int num2) {
		System.out.println("몫 : " + (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));
	}
	
	public static int oddEven(int num) {
		return num % 2;
	}
}
