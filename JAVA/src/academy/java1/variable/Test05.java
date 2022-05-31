package academy.java1.variable;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. 자릿수 쪼개기");
        System.out.println("입력");
        int number = scan.nextInt();

        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;
        int thousands = (number / 1000);

        System.out.println(thousands + "\n" + hundreds + "\n"
            + tens + "\n" + units);
        System.out.println();


        System.out.println("2. 자릿수 쪼개기 역순");
        System.out.println("입력");
        number = scan.nextInt();

        units = number % 10;
        tens = (number / 10) % 10;
        hundreds = (number / 100) % 10;
        thousands = (number / 1000);

        System.out.println(units + "\n" + tens + "\n"
            + hundreds + "\n" + thousands);
        System.out.println();


        System.out.println("3. 자릿수 합 구하기");
        System.out.println("입력");
        number = scan.nextInt();

        units = number % 10;
        tens = (number / 10) % 10;
        hundreds = (number / 100) % 10;
        thousands = (number / 1000);

        int sum = units + tens + hundreds + thousands;
        System.out.println("합계는 " + sum + " 입니다.");
        System.out.println();


        System.out.println("4. 역순 출력");
        System.out.print("입력 : ");
        number = scan.nextInt();

        units = number % 10;
        tens = (number / 10) % 10;
        hundreds = (number / 100) % 10;

        number = (units * 100) + (tens * 10) + hundreds;
        System.out.println("출력 : " + number);

    }
}

