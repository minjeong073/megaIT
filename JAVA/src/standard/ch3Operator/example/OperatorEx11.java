package standard.ch3Operator.example;

public class OperatorEx11 {
    public static void main(String[] args) {

        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c'=%d%n", a, (int) a);
        System.out.printf("'%c'=%d%n", d, (int) d);
        System.out.printf("'%c'=%d%n", zero, (int) zero);
        System.out.printf("'%c'=%d%n", two, (int) two);
    }
}
/*
결과

'd' - 'a' = 3   // 유니코드 뺄셈
'2' - '0' = 2   // 문자 2 를 숫자로 바꾸는 방법! (문자 '0'을 빼줌)
'a'=97
'd'=100
'0'=48
'2'=50
 */
