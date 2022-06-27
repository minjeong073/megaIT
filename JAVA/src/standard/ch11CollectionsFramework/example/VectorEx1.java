package standard.ch11CollectionsFramework.example;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {

        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");     // size = 3, capacity = 5
        print(v);

        v.trimToSize(); // 빈 공간 없앰 -> capacity = size = 3
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("=== After clear() ===");
        print(v);

    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}

/*
결과

[1, 2, 3]
size : 3
capacity : 5

=== After trimToSize() ===      // 이미 생성된 배열 크기 변경할 수 없기 때문에 새로운 배열(인스턴스)을 생성해서 추가
                                // 주소값 변경 1
[1, 2, 3]
size : 3
capacity : 3

=== After ensureCapacity(6) ===     // vector 의 capacity 가 최소한 6 이 되도록 -> 새로운 배열(인스턴스) 생성
                                    // 주소값 변경 2
[1, 2, 3]
size : 3
capacity : 6

=== After setSize(7) ===        // size 가 7이 되도록 -> 새로운 배열(인스턴스) 생성, capacity 가 부족한 경우 자동으로 기존 크기의 2배로 증가
                                // 주소값 변경 3
[1, 2, 3, null, null, null, null]
size : 7
capacity : 12

=== After clear() ===
[]
size : 0
capacity : 12

--> 용량을 변경할 경우 새로운 배열을 생성해서 데이터를 복제해야하기 때문에 효율성이 떨어질 수 있음
    처음 인스턴스를 생성할때부터 충분한 용량으로 생성하기
 */
