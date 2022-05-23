package academy.DLoop;

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

        System.out.println("3. 모래시계 출력하기");
        System.out.print("모래시계 크기를 입력하세요 : ");
        // 홀수 정수
//        int num = scan.nextInt();
        num = 3;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        5

        *+*+*
        -*+*-
        --*--
        -*+*-
        *+*+*

        7

        *+*+*+*
        -*+*+*-
        --*+*--
        ---*---
        --*+*--
        -*+*+*-
        *+*+*+*

         */


    }
}
