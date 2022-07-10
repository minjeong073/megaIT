package standard.ch6OOP.example;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1(); // 컴파일러가 자동으로 기본 생성자 추가
//        Data2 d2 = new Data2(); // compile error
    }
}

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {  // 매개변수가 있는 생성자
        value = x;
    }
}
