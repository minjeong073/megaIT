package standard.ch6OOP.example;

public class ReferenceParamEx {
    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

    }

    static void change(Data d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
/*
결과

main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 1000
 */
