package standard.ch6OOP.example;

public class PowerTest {
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += power(x, i);
        }
        System.out.println(result);
    }

    static long power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }
}

/*
결과

30
f(2,4) = 2 * f(2,3) = 2 * 8 = 16
f(2,3) = 2 * f(2,2) = 2 * 4 = 8
f(2,2) = 2 * f(2,1) = 2 * 2 = 4
f(2,1) = 2

result = 2 + 4 + 8 + 16 = 30
 */
