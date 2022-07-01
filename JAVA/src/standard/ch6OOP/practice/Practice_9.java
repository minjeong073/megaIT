package standard.ch6OOP.practice;

public class Practice_9 {
}
// 모든 병사의 공격력, 방어력은 같아야함
// 클래스의 멤버 중 static 을 붙여야 하는 것들?
// weapon, armor : 모든 Marine 인스턴스에 대해 같아야 하므로
// weaponUp(), armorUp() : static 변수를 사용하므로
class Marine {
    int x=0, y=0;   // Marine 의 위치좌표 (x,y)
    int hp = 60;    // 현재 체력
    int weapon = 6; // 공격력  
    int armor = 0;  // 방어력
    
    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
