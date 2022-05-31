package academy.java1.loop;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 반복 출력");
		System.out.print("횟수를 입력하세요 : ");
		int count = scan.nextInt();
		
		int i = 0;
		while (i < count) {
			System.out.println("응 아니야");
			i++;
		}
		System.out.println();
		
		
		System.out.println("2. 카운트 다운 \"발사\"");
		System.out.print("카운트 다운 입력하세요 : ");
		count = scan.nextInt();
		
		i = 0;
		while (i <= count) {
			System.out.println(count);
			count --;
		}
		System.out.println("발사");
		System.out.println();
		
		
		System.out.println("3. 짝수 합 구하기");
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		i = 1;
		int sum = 0;
		
		while (i <= num) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("더한 결과 : " + sum);
		System.out.println();
		
		
		System.out.println("4. 반복 입력");
		
		i = 0;
		while (i < 5) {
			System.out.print("입력 : ");
			num = scan.nextInt();
			System.out.println("출력 : " + num);
			i++;
		}
		System.out.println();
		
		
		System.out.println("5. 구구단");
		
		i = 1;
		while (i <= 9) {
			System.out.println("2 X " + i + " = " + (2 * i));
			i++;
		}
		
		scan.close();
	}

}
