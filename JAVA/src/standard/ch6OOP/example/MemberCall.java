package standard.ch6OOP.example;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;    // Non-static field 'iv' cannot be referenced from a static context
    static int cv2 = new MemberCall().iv;   // 객체 생성해야 사용 가능

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv);   // Non-static field 'iv' cannot be referenced from a static context
        MemberCall c = new MemberCall();
        System.out.println(c.iv);   // 객체 생성한 후에야 인스턴스 변수 참조 가능
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();  // Non-static method 'instanceMethod1()' cannot be referenced from a static context
        MemberCall c = new MemberCall();
        c.instanceMethod1();    // 인스턴스 생성한 후에야 호출 가능
    }

    void instanceMethod2() {
        staticMethod1();    // 인스턴스 메서드에서는
        instanceMethod1();  // 인스턴스 메서드, 클래스 메서드 모두 호출 가능
    }

}
