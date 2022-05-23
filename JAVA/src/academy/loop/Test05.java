package academy.loop;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("1. 알파벳 출력");
//        // 65 : A , 90 : Z
//        char charAlphabet = 65;
//        do {
//            String alphabet = String.valueOf(charAlphabet);
//            System.out.print(alphabet + " ");
//            charAlphabet++;
//
//        } while (charAlphabet < 91);
//        System.out.println();
//        System.out.println();
//
//
//        System.out.println("2. 합 구하기");
//        System.out.print("수를 입력하세요 : ");
//        int num = scan.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i < num; i++) {
//            sum += i;
//            if (sum > 100) {
//                break;
//            }
//        }
//        System.out.println(sum);
//        System.out.println();
//
//
//        System.out.println("3. 등차수열");
//        // 1 4 7 10 13 16 19 22 25
//
//        System.out.print("세 개의 수를 입력하세요 : ");
//        int a = scan.nextInt();
//        int d = scan.nextInt();
//        int n = scan.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            num = a + (d * i);
//        }
//        System.out.println(num);
//        System.out.println();
//
//
//        System.out.println("4. 소수 판별");
//        System.out.print("수를 입력하세요 : ");
//        num = scan.nextInt();
//
//        int count = 0;
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                count++;
//               break;
//            }
//        }
//
//        if (count > 0) {
//            System.out.println("소수가 아닙니다.");
//        } else {
//            System.out.println("소수 입니다.");
//        }
//        System.out.println();


        System.out.println("5. 가위바위보 대결");

        Random rand = new Random();

        int youWin = 0;
        int conputerWin = 0;

        for (int i = 0; i < 5; i++) {
            int computerPlay = rand.nextInt(3) + 1;
            System.out.print("가위(1) 바위(2) 보(3)!! : ");
            int num = scan.nextInt();

            System.out.print("computer : " + computerPlay);

            if (computerPlay > num) {
                conputerWin++;
                System.out.println(" -졌습니다.");
            } else if (computerPlay < num) {
                youWin++;
                System.out.println(" -이겼습니다.");
            } else {
                System.out.println(" -비겼습니다.");
            }

            if (conputerWin == 3 || youWin == 3) {
                break;
            }
        }
        
        if (conputerWin > youWin) {
            System.out.println("최종 결과 " + conputerWin + ":" + youWin
                + " 로 당신의 패배 입니다.");
        } else if (conputerWin < youWin) {
            System.out.println("최종 결과 " + conputerWin + ":" + youWin
                + " 로 당신의 승리 입니다.");
        } else {
            System.out.println("최종 결과 " + conputerWin + ":" + youWin
                + " 로 무승부 입니다.");
        }

    }
}
