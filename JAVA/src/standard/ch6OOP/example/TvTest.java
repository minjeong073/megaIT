package standard.ch6OOP.example;

class Tv {
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // Tv의 기능(메서드)
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class TvTest {
    public static void main(String[] args) {

        Tv t;   // TV 인스턴스를 참조하기 위한 변수 t 선언
                // --> 객체의 주소값이 참조변수 t 에 저장되어 t 를 통해 Tv 인스턴스에 접근 가능
        t = new Tv();   // TV 인스턴스 생성
        t.channel = 7;  // TV 인스턴스 멤버변수 channel 값 설정
        t.channelDown();    // TV 인스턴스 메서드 channelDown() 호출
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}


