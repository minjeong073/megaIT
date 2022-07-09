package standard.ch6OOP.example;

class MyMath2 {
    
    long a, b;  // 인스턴스 변수
    
    // 인스턴스 변수 a, b 만을 이용 -> 매개변수 필요 없음
    long add() {
        return a + b;
    }
    long subtract() {
        return a - b;
    }
    long multiply() {
        return a * b;
    }
    double divide() {
        return a / b;
    }
    
    // 매개변수만으로 작업
    static long add(long a, long b) {   // 지역변수
        return a + b;
    }
    static long subtract(long a, long b) {
        return a - b;
    }
    static long multiply(long a, long b) {
        return a * b;
    }
    static double divide(double a, double b) {
        return a / b;
    }
}

public class MyMathTest2 {
    public static void main(String[] args) {

        // 인스턴스 생성 없이 클래스 메서드 호출
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200.0, 100.0));

        // 인스턴스 생성
        MyMath2 mm = new MyMath2();
        // 인스턴스 변수 초기화
        mm.a = 200L;
        mm.b = 100L;

        // 인스턴스 메서드 호출
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
