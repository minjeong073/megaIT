package standard.ch6OOP.example;

public class BlockTest {
    static {
        System.out.println("static { }");
    }
    {
        System.out.println("{ }");
    }
    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}

/*
결과
static { }
BlockTest bt = new BlockTest(); 
{ }
생성자
BlockTest bt2 = new BlockTest(); 
{ }
생성자

실행되면서 BlockTest 가 메모리에 로딩
-> 클래스 초기화 블럭이 가장 먼저 수행
-> main 메서드 수행되어 BlockTest 인스턴스 생성
-> 인스턴스 초기화 블럭이 수행
-> 생성자 수행

클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행
인스턴스 초기화 블럭은 인스턴스가 생성될 때마다 수행
 */
