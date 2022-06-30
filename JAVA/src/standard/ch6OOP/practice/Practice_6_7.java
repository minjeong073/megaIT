package standard.ch6OOP.practice;

public class Practice_6_7 {
    // Q6
//    // 두 점 (x,y) (x1,y1) 사이 거리
    // static 메서드 : 매개변수(지역변수)로 필요한 값 제공받음
//    static double getDistance(int x, int y, int x1, int y1) {
////        return Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2));
//        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
//    }

    public static void main(String[] args) {
        // Q6
//        System.out.println(getDistance(1,1,2,2));

        // Q7
         MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // 인스턴스 메서드 : 인스턴스 변수 사용해서 작업 가능 -> static 붙일 수 없음
    public double getDistance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
}
