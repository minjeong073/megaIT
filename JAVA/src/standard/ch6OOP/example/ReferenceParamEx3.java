package standard.ch6OOP.example;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);   
        printArr(arr);  // 정렬 후 결과 출력
        System.out.println("sum=" + sumArr(arr));

    }

    private static void printArr(int[] arr) {
        System.out.print("[");

        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    private static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    private static int sumArr(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
/*
결과

[3, 2, 1, 6, 5, 4, ]
[1, 2, 3, 4, 5, 6, ]
sum=21

--> 매개변수 타입이 배열(참조형 매개변수) 이기 때문에 sortArr 한 후 배열이 변경됨
 */
