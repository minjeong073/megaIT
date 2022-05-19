package standard.ch2Variable.example;

public class VarEx1 {

    public static void main(String[] args) {

        // 변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
        // 변수의 초기화 : 변수를 사용하기 전에 처음으로 값을 저장하는 것

        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);

    }
}