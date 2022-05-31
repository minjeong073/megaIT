package standard.ch6OOP.example;

class TvTest3 {
    public static void main(String[] args) {

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");
        t2 = t1;    // t1이 저장하고 있는 값(주소)를 t2에 저장
                    // --> t2의 인스턴스 주소에 접근할 수 없게 됨

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");

        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");

        /*
        결과

        t1의 channel 값은 0 입니다.
        t2의 channel 값은 0 입니다.
        t1의 channel 값을 7로 변경하였습니다.
        t1의 channel 값은 7 입니다.
        t2의 channel 값은 7 입니다.

         */

    }
}
