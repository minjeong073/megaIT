package standard.ch6OOP.practice;

public class Practice_3_5 {
    public static void main(String[] args) {
        // Q4
//        Student s = new Student();
//        s.name = "홍길동";
//        s.ban = 1;
//        s.no = 1;
//        s.kor = 100;
//        s.eng = 60;
//        s.math = 76;
//
//        System.out.println("이름 : " + s.name);
//        System.out.println("총점 : " + s.getTotal());
//        System.out.println("평균 : " + s.getAverage());

        // Q5
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return this.kor + this.eng + this.math;
    }

    public float getAverage() {
        // 소수점 둘째자리 반올림
        return (int) (((getTotal() / 3f) * 10) + 0.5) / 10f;
    }

    public String info() {
        return this.name + ',' + this.ban + ',' + this.no + ','
            + this.kor + ',' + this.eng + ',' + this.math + ','
            + getTotal() + ',' + getAverage();
    }

}


