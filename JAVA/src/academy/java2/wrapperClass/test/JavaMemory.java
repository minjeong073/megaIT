package academy.java2.wrapperClass;

public class JavaMemory {
    /*
    자바의 메모리 영역 구성
    - 메서드 영역
        : JVM 이 동작해서 클래스가 로딩될 때 생성
        : 클래스 정보(멤버변수 이름), 변수 정보(데이터 타입, 
        접근제어자 정보), 메서드 정보(메서드 이름, 리턴 타입, 파라미터
        접근제어자 정보), static 변수, constant pool(문자 상수, 
        타입, 필드, 객체 참조가 저장) 등을 분류해서 저장
    - stack 영역
        : 컴파일 타임 시 할당
        : 지역변수, 파라미터, 리턴값, 연산에 사용되는 임시 값 등 생성
        : 메서드 호출할 때마다 개별적으로 stack 생성
    - heap 영역
        : 런타임 시 할당
        : new 키워드로 생성된 객체와 배열 저장
        : '메서드 영역'에 로드 된 클래스만 생성 가능
        : GC의 주요 대상

    * 컴파일 타임 : 소스코드가 기계어로 변환되어 실행 가능한 프로그램이 되는 과정
                : System error, 타입 체크 오류 등
    * 런타임 : 컴파일 이후 프로그램이 실행되는 과정
            : 메모리 부족 오류, Null 참조 오류, 0 나누기 오류 등등

    * static : 클래스가 메모리에 올라갈 때 자동으로 생성
              -> 인스턴스 생성하지 않아도 호출 가능능
   */
}
