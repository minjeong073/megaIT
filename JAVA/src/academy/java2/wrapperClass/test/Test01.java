package academy.java2.wrapperClass.test;

public class Test01 {

    public static void main(String[] args) {
        int number1 = 10;
        Integer number2 = new Integer(10);
        if (number1 == number2) {
            System.out.println("int == Integer");
        } else {
            System.out.println("int =/= Integer");
        }
    }

}
