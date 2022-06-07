package academy.java2.construct.test04;

import java.util.Arrays;
import java.util.Random;

public class LottoChecker {
    private int[] winningNumber;
    private String result;

    public LottoChecker() {
        this.winningNumber = new int[6];
    }

    public void drawLots() {
        Random random = new Random();
        // FIN : 당첨 번호 저장하기

        for (int i = 0; i < this.winningNumber.length; i++) {
            this.winningNumber[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (this.winningNumber[j] == this.winningNumber[i]) {
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

    // 당첨 여부 확인 -> return String
    public String checkLotto(Lotto lotto) {
        int[] input = lotto.getInput();
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < winningNumber.length; j++) {
                if (input[i] == winningNumber[j]) {
                    count++;
                    break;
                }
            }
        }

        if (count == 6) {
            return "1등";
        } else if (count == 5) {
            return "2등";
        } else if (count == 4) {
            return "3등";
        } else if (count == 3) {
            return "4등";
        } else if (count == 2) {
            return "5등";
        }
        return "꽝";
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
