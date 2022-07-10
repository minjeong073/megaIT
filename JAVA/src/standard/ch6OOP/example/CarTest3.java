package standard.ch6OOP.example;

public class CarTest3 {
    public static void main(String[] args) {

        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1); // c1 의 복사본 c2 생성
        System.out.println("c1의 color=" + c1.color + ", gearType="
            + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType="
            + c2.gearType + ", door=" + c2.door);

        c1.door = 100;  // c1의 인스턴스 변수 door 의 값 변경

        System.out.println("c1.door = 100; 수행 후");
        System.out.println("c1의 color=" + c1.color + ", gearType="
            + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType="
            + c2.gearType + ", door=" + c2.door);

    }
}
/*
결과

c1의 color=white, gearType=auto, door=4
c2의 color=white, gearType=auto, door=4
c1.door = 100; 수행 후
c1의 color=white, gearType=auto, door=100
c2의 color=white, gearType=auto, door=4

c2 는 c1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만
서로 독립적으로 메모리 공간에 존재하는 별도의 인스턴스
-> c1 값들이 변경되어도 c2 는 영향 받지 않음
 */

class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "auto", 4);
    }

    Car3(Car3 c) {
//        color = c.color;
//        gearType = c.gearType;
//        door = c.door;
        this(c.color, c.gearType, c.door);  // 생성자 활용
    }

    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}



