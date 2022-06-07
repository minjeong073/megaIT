package academy.java2.construct.test04;

import java.util.Random;

public class Lotto {
    private int[] input;

    //private Random rand = SecureRandom.getInstanceStrong();  // SecureRandom is preferred to Random
    //
    //public void doSomethingCommon() {
    //  int rValue = this.rand.nextInt();

    public Lotto() {
        this.input = new int[6];
    }

    public void manualInput(int[] input) {

        // 배열 가져와서 확인 -> 중복될 경우 ?
        // main 에서 중복 확인
        this.input = input;
    }

    public void autoInput() {
        Random random = new Random();

        // FIN : random 값 저장하기
        for (int i = 0; i < this.input.length; i++) {
            this.input[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (this.input[j] == this.input[i]) {
                    i--;
                    break;
                }
            }
        }
    }

    public void printInputNumbers() {
        System.out.println("입력 값");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public int[] getInput() {
        return input;
    }
}
