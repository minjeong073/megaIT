package standard.ch6OOP.example;

public class MainTest {
    public static void main(String[] args) {
        main(null);
    }
}
/*
결과

Exception in thread "main" java.lang.StackOverflowError
	at standard.ch6OOP.example.MainTest.main(MainTest.java:5)
	at standard.ch6OOP.example.MainTest.main(MainTest.java:5)
	at standard.ch6OOP.example.MainTest.main(MainTest.java:5)
	...

중단 조건이 없어 무한 호출에 빠지게 됨
 */
