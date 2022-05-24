package standard.ch2Variable.example;

public class CastingEx1 {

    public static void main(String[] args) {

        double d = 85.4;
        int score = (int) d;

        System.out.println("score = " + score);
        System.out.println("d = " + d);

        /*
        결과

        score = 85
        d = 85.4

        --> 형 변환 후에도 피연산자 (d) 에는 변화 없음
         */

    }
}
