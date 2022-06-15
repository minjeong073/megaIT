package standard.ch6OOP.example;

// 매개변수 유효성 검사
public class FactorialTest2 {
    
    public static void main(String[] args) {
        
        int n = 21;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result = factorial(i);
            
            if (result == -1) {
                System.out.printf("유효하지 않은 값입니다. (0<n<=20) : %d%n", n);
                break;
            }

            System.out.printf("%2d!=%20d%n", i, result);
        }
    }

    static long factorial(int n) {
        if (n <= 0 || n > 20) {
            return -1;  // 메서드 반환 타입의 최댓값 고려 --> 유효성 검사
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
/*
결과

 1!=                   1
 2!=                   2
 3!=                   6
 4!=                  24
 5!=                 120
 6!=                 720
 7!=                5040
 8!=               40320
 9!=              362880
10!=             3628800
11!=            39916800
12!=           479001600
13!=          6227020800
14!=         87178291200
15!=       1307674368000
16!=      20922789888000
17!=     355687428096000
18!=    6402373705728000
19!=  121645100408832000
20!= 2432902008176640000
유효하지 않은 값입니다. (0<n<=20) : 21
 */
