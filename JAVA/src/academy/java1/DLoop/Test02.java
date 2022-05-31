package academy.java1.DLoop;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. 구구단");
        System.out.print("단수 범위를 입력하세요 : ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }

        System.out.println("2. 별찍기");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = num - i; j < num + (i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("3. 모래시계 출력하기");
        System.out.print("모래시계 크기를 입력하세요 : ");

        num = scan.nextInt();

       for (int i = num; i > num/2; i--) {
            for (int j = num-i; j > 0; j--) {
                System.out.print("-");
            }
            for (int j = i; j > num/2 +1 ; j--) {
                System.out.print("*+");
            }
            System.out.print("*");
            for (int j = num-i; j > 0; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
        
        for (int i = num/2; i > 0; i--) {
        	for (int j = i; j > 1; j--) { 
                System.out.print("-");
            }
            for (int j = i; j <= num/2; j++) {
                System.out.print("*+");
            }
            System.out.print("*");
            for (int j = i; j > 1; j--) {
                System.out.print("-");
            }
            System.out.println();
	}
        System.out.println();
	
	
	System.out.println("4. 숫자 삼각형 출력하기");
        System.out.print("숫자 삼각형의 크기를 입력하세요 : ");
        num = scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
        	int add = num-1;
        	int updateNum = i;
        	System.out.print(i + " ");
        	
		for (int j = 1; j < i; j++) {
			updateNum += add;
			System.out.print(updateNum + " ");
			add--;
		}
		System.out.println();
	}
	    
	// 다른 풀이
        // 4 일 때
        for (int i = 1; i <= 4; i++) {
        	int number = i; 
		for (int j = 0; j < i + 1; j++) {
			System.out.print(number + " ");
			number += 3 - j;
		}
		System.out.println();
	}
        
        int line = scan.nextInt();
        for (int i = 1; i <= line; i++) {
        	int number = i;
		for (int j = 0; j < i; j++) {
			System.out.print(number + " ");
			number += (line - 1) - j;
		}
		System.out.println();
	}
	    

    }
}
