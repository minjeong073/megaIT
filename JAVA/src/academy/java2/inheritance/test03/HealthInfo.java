package academy.java2.inheritance.test03;

public class HealthInfo {
	
    protected String name;
    protected double height;
    protected double weight;

    public HealthInfo() {
        // 기본 생성자 do nothing
    }

    public HealthInfo(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void showInfo() {
        System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg 입니다.");
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
