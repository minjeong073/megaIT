package standard.ch2Variable.example;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요. > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num=%d%n", num);


        /*

        nextInt(), nextFloat() 과 같이 변환 없이 숫자를 바로 입력 받을 수 있지만
        화면에서 연속적으로 값을 입력받아서 사용하기에 까다로움

        --> nextLine() 으로 모든 값을 입력받아 적절히 변환하는 것이 더 나음

         */
    }
}
