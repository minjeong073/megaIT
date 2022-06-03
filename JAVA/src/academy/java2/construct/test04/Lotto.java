package academy.java2.construct.test04;

import java.util.Random;

public class Lotto {
    private int[] input;


    public void manualInput(int[] input) {

        // 배열 가져와서 확인 -> 중복될 경우 ?
        // main 에서 확인 ->
//        for (int i = 0; i < input.length; i++) {
//            for (int j = 0; j < i; j++) {
//
//            }
//        }
//        for (int i = 1; i <= input.length; i++) {
//            if (input[i] == input[i-1]) {
//                System.out.println("중복된 숫자입니다.");
//
//            }
//        }

        this.input = input;

    }

    public int[] autoInput(Random random) {
        input = new int[6];
        // FIN : random 값 저장하기 + return 하기
        for (int i = 0; i < this.input.length; i++) {
            this.input[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (this.input[j] == this.input[i]) {
                    i--;
                }
            }
        }
        return this.input;
    }

    public int[] getInput() {
        return input;
    }
}
