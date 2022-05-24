package standard.ch3Operator.example;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);
        System.out.println(c);
        
        /*
        결과
        
        44
        
        결과값인 300은 byte 형의 범위를 넘어감
        --> 데이터 손실이 발생하여 44가 저장됨
         */
    }
}
