package standard.ch3Operator.example;

public class OperatorEx4 {
    public static void main(String[] args) {

        int i = -10;
        i = +i;

        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i);

        /*
        결과

        -10
        10
         */
    }
}
