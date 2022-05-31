package standard.ch3Operator.example;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;

        System.out.println(c);
        
    }
}
/*
결과
-1454759936

overflow 발생
-> a * b 가 이미 int 형 이므로 long 으로 자동 형변환 되어도 값은 변하지 않음
--> long c = (long) a * b; 이어야 올바른 값이 나옴
 */
