package academy.java1.variable;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. 사칙연산");
        System.out.print("입력1 : ");
        int number1 = scan.nextInt();

        System.out.print("입력2 : ");
        int number2 = scan.nextInt();

        int add = number1 + number2;
        int minus = number1 - number2;
        int multi = number1 * number2;
        int div = number1 / number2;

        System.out.println("덧셈 : " + add + "\n뺼셈 : " + minus
            + "\n곱셈 : " + multi + "\n나눗셈 : " + div);
        System.out.println();


        System.out.println("2. 몫과 나머지");

        System.out.print("입력1 : ");
        number1 = scan.nextInt();

        System.out.print("입력2 : ");
        number2 = scan.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("몫 : " + quotient + " 나머지 : " + remainder);
        System.out.println();


        System.out.println("3. 정사각형 넓이");
        System.out.print("길이 : ");
        int length = scan.nextInt();

        System.out.println("정사각형의 넓이 : " + (length * length));
        System.out.println();


        System.out.println("4. 삼각형의 넓이");
        System.out.print("밑변 : ");
        int width = scan.nextInt();

        System.out.print("높이 : ");
        int height = scan.nextInt();

        double area = (double) width * height / 2;

        System.out.println("삼각형의 넓이 : " + area);
        System.out.println();


        System.out.println("5. 교체");
        System.out.print("x : ");
        int x = scan.nextInt();

        System.out.println("y : ");
        int y = scan.nextInt();

        int tmp = x;
        x = y;
        y = tmp;

        System.out.println("x : " + x + " y : " + y);
        System.out.println();


        System.out.println("6. 초 변환");
        System.out.print("초 : ");
        int second = scan.nextInt();

        int minute = second / 60;
        second = second % 60;

        System.out.println(minute + "분 " + second + "초");

    }
}