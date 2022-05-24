package standard.ch3Operator.example;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
//        byte c = a + b;
//      컴파일에러 -> + 연산자는 int 형끼리 더함 , int(4byte) 형 결과값을 byte(1byte) 형에 넣을 수 없음

        byte c = (byte) (a + b);
    }
}
