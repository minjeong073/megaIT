package standard.ch6OOP.example;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3, 5, result2);
        System.out.println(result2[0]);
    }
    int add(int a, int b) {
        return a + b;
    }
    void add(int a, int b, int[] result) {  // 반환값이 없어도 참조 변수를 활용하면 메서드의 실행 결과를 얻어올 수 있음
        result[0] = a + b;
    }
}
