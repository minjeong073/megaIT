package standard.ch6OOP.example;

public class StaticBlockTest {
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
/*
결과

arr[0] : 4
arr[1] : 2
arr[2] : 1
arr[3] : 8
arr[4] : 8
arr[5] : 6
arr[6] : 6
arr[7] : 9
arr[8] : 3
arr[9] : 3

명시적 초기화를 통해 배열 arr 를 생성
클래스 초기화 블럭으로 배열의 각 요소들을 random() 값으로 채움
-> 배열이나 예외처리 등은 명시적 초기화만으로는 작업할 수 없기 때문에 초기화 블럭 사용
 */