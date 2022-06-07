package academy.java2.construct.test03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        OmrCard myOmrCard = new OmrCard("A", "11111");
//        OmrCardReader reader = new OmrCardReader(new int[] {1, 2, 3, 4, 5});

//        int[] input = new int[5];

        myOmrCard.setInput(1,3);
        myOmrCard.setInput(4,2);
        myOmrCard.setInput(5, 1);
        myOmrCard.setInput(2, 4);
        myOmrCard.setInput(3, 5);

        OmrCardReader reader = new OmrCardReader();
        reader.setAnswer(3, 3, 3, 3, 3);
//        reader.printInfo();

//        // 입력 main 에서 받아서 omrCard class 에 저장하기
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("5문제의 정답을 입력하세요. (1~5)");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print((i+1) + "번 문제 정답 : ");
//            input[i] = scanner.nextInt();
//            if (input[i] < 0 || input[i] > 5) {
//                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
//                i--;
//            }
//        }
//        myOmrCard.setInput(input);

        reader.grading(myOmrCard);
        reader.printScore(myOmrCard);
        System.out.println();

        //
        OmrCard omrCard1 = new OmrCard("B", "22222");
        OmrCard omrCard2 = new OmrCard("C", "33333");

        OmrCard[] cards = {omrCard1, omrCard2};

        omrCard1.setInput(new int[] {3, 3, 3, 2, 1});
        omrCard2.setInput(new int[] {3, 3, 3, 3, 1});

//        reader.grading(cards);
        reader.printResult(cards);

    }
}
