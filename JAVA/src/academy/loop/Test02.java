package academy.loop;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        System.out.println("1. 반복 출력");
        for (int i = 35; i < 41; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("2. 반복 출력");
        for (int i = 5; i > -6; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("3. 특정 조건 구하기");
        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("4. 갯수 세기");
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println("7의 배수의 갯수는 : " + count);
        System.out.println();

        System.out.println("5. 구구단");
        Scanner scan = new Scanner(System.in);

        System.out.print("단수를 입력하세요 : ");
        int dan = scan.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }
        System.out.println();


        System.out.println("6. 가장 큰 수");
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("수를 입력하세요 : ");
            int num = scan.nextInt();

            if (max < num) {
                max = num;
            }
        }
        System.out.println("가장 큰 수 : " + max);

    }
}
