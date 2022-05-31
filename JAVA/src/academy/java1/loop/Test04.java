package academy.java1.loop;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. 합 구하기");
        System.out.print("수를 입력하세요 : ");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("합 : " + sum);
        System.out.println();


        System.out.println("2. 합과 평균 구하기");
        sum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " 번째 수를 입력하세요 : ");
            num = scan.nextInt();
            sum += num;
        }
        double average = (double) sum / 5;
        System.out.println("총합 : " + sum + " 평균 : " + average);
        System.out.println();


        System.out.println("3. 팩토리얼");
        System.out.print("수를 입력하세요 : ");
        num = scan.nextInt();

        int answer = 1;

        if (num < 0 || num > 10) {
            System.out.println("잘못된 범위의 값 입니다");
        } else {
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }
        }
        System.out.println(num + "! = " + answer);
        System.out.println();

        System.out.println("4. 최소값");

        int min = 1001;
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " 번쨰 수를 입력 하세요 : ");
            num = scan.nextInt();

            if (num < min) {
                min = num;
            }
        }
        System.out.println("최소값은 " + min + " 입니다.");
        System.out.println();

        System.out.println("5. 약수 구하기");
        System.out.print("수를 입력 하세요 : ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
