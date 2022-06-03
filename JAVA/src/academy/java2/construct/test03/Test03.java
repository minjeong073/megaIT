package academy.java2.construct.test03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        OmrCard myOmrCard = new OmrCard("김민정", "123456789");
        OmrCardReader reader = new OmrCardReader(new int[] {1, 2, 3, 4, 5});

        int[] input = new int[5];

        // 입력 main 에서 받아서 omrCard class 에 저장하기
        Scanner scanner = new Scanner(System.in);
        System.out.println("5문제의 정답을 입력하세요. (1~5)");

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "번 문제 정답 : ");
            input[i] = scanner.nextInt();
            if (input[i] < 0 || input[i] > 5) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                i--;
            }
        }

        myOmrCard.exam(input);

        reader.grading(myOmrCard);
        reader.printScore(myOmrCard);
    }
}
