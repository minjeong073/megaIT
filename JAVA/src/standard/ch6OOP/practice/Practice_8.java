package standard.ch6OOP.practice;

public class Practice_8 {
}
// 종류별로 변수 구분하기
class PlayingCard {
    int kind;   // 인스턴스 변수
    int num;    // 인스턴스 변수
    static int width;   // 클래스(static) 변수
    static int height;  // 클래스(static) 변수

    PlayingCard(int k, int n) { // k, n : 지역변수
        kind = k;
        num = n;
    }

    // args, card : 지역변수
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
    }
}
