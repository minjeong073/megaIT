package academy.java2.construct.test04;

import java.util.Arrays;
import java.util.Random;

public class LottoChecker {
    private int[] winningNumber;
    private String result;


    public void getWinningNumber() {
        Random random = new Random();
        // FIN : 당첨 번호 저장하기
        winningNumber = new int[6];
        for (int i = 0; i < winningNumber.length; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (winningNumber[j] == winningNumber[i]) {
                    i--;
                }
            }
        }

    }

    public void checkWinning(Lotto lotto) {

        // FIN : 당첨 여부 확인하기
        int[] input = lotto.getInput();
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (winningNumber[i] == input[j]) {
                    count++;
                }
            }
        }

        switch (count) {
            case 6 :
                result = "1등";
                break;
            case 5 :
                result = "2등";
                break;
            case 4:
                result = "3등";
                break;
            case 3 :
                result = "4등";
                break;
            case 2 :
                result = "5등";
                break;
            default :
                result = "꽝";
        }

    }

    public void printResult(Lotto lotto) {

        // FIN : 당첨 결과 출력하기
        int[] lottoInput = lotto.getInput();
        Arrays.sort(lottoInput);    // ++ 오름차순 정렬해서 출력하도록
        for (int i = 0; i < lottoInput.length; i++) {
            System.out.print(lottoInput[i] + " ");
        }
        System.out.println(result);

    }

    public void printWinningNumber() {
        System.out.print("당첨 번호 : ");
        Arrays.sort(winningNumber); // ++ 오름차순 정렬해서 출력하도록
        for (int i = 0; i < winningNumber.length; i++) {
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();
    }
}
