package standard.ch6OOP.example;

public class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType="
            + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType="
            + c2.gearType + ", door=" + c2.door);
    }
}

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);   // 아무런 옵션이 없을 경우 기본 옵션으로 생성
    }
    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

/*
결과
c1의 color=white, gearType=auto, door=4
c2의 color=blue, gearType=auto, door=4
 */
