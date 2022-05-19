package standard.ch2Variable.example;

public class PrintfEx1 {
    public static void main(String[] args) {

        // 같은 값이라도 다르게 출력하고 싶을 경우 printf

        /*
        %b : boolean
        %d : decimal
        %o : octal
        %x : hexa-decimal
        %f : floating-point(부동 소수점)
        %e : exponent(지수)
        %c : character
        %s : string
         */

        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;   // octal 10 (decimal 8)
        int hexNum = 0x10;  // hexa-decimal 10 (decimal 16)
        int binNum = 0b10;  // binary 10 (

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);    // 출력될 값이 차지할 공간 지정
        System.out.printf("finger=[%-5d]%n", finger);   // 처음부터 시작
        System.out.printf("finger=[%05d]%n", finger);   // 0으로 채움
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);    // # 는 접두사 (16진수 0x , 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);   // 정수를 2진 문자열로 변환 -> 문자열로 반환

        /*
        출력

        b=1
        s=2
        c=A, 65
        finger=[   10]
        finger=[10   ]
        finger=[00010]
        big=100000000000
        hex=0xffffffffffffffff
        octNum=10, 8
        hexNum=10, 16
        binNum=10, 2
         */


    }
}
