package academy.java1.loop;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        System.out.println("1. 무한루프 탈출");
        int i = 0;
        while(true) {
            System.out.println("Hello World");
            i++;

            if (i == 8) {
                break;
            }
        }
        System.out.println();

        System.out.println("2. 짝수 출력");
        for (int j = 1; j < 11; j++) {
            if (j % 2 != 0) {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("3. 배수 출력");
        Scanner scan = new Scanner(System.in);

        System.out.print("수를 입력하세요 : ");
        int num = scan.nextInt();

        for (int j = 1; j < 101; j++) {
            if (j % num == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.println();


        System.out.println("4. 무한 입력");
        while(true) {
            System.out.print("수를 입력하세요 : ");
            num = scan.nextInt();
            if (num == 0) {
                System.out.println("끝");
                break;
            }
            
        }

    }
}
