package standard.ch6OOP.example;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

    }
    // 참조형 반환타입
    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
