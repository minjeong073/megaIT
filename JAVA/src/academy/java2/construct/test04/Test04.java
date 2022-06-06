package academy.java2.construct.test04;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Lotto lotto = new Lotto();
        LottoChecker checker = new LottoChecker();

        // 당첨 번호 생성
        checker.getWinningNumber();
        
        
        // 수동 입력 1
//        int[] manualInput = {3, 9, 14, 23, 43, 32};

        // 수동 입력 2
        // 중복된 숫자 확인하기
        Scanner scanner = new Scanner(System.in);

        int[] manualInput = new int[6];
        for (int i = 0; i < manualInput.length; i++) {
            manualInput[i] = scanner.nextInt();
            for (int j = 0; j < i; j++) {
                if (manualInput[j] == manualInput[i]) {
                    System.out.println("중복된 숫자입니다.");
                    i--;
                }
            }
        }

        // 수동 입력
        lotto.manualInput(manualInput);

        // 당첨 번호 출력
        checker.printWinningNumber();
        
        // 수동 입력 결과 출력
        checker.checkWinning(lotto);
        checker.printResult(lotto);

        // 자동 입력
        lotto.autoInput();
        
        // 자동 입력 결과 출력
        checker.checkWinning(lotto);
        checker.printResult(lotto);

    }
}
