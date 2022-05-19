package standard.ch2Variable.example;

public class StringEx {
    public static void main(String[] args) {

        // 7과 같은 기본형 타입의 값을 문자열로 변환할 때
        // -> ""(빈 문자열)을 더해주면 됨

        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);

        /*
        출력
        Java
        Java8.0
        7
         7
        7
        7

        14
        77
         */

    }
}
