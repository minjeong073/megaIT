package standard.ch6OOP.practice;

public class Practice_1_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());   // 3
        System.out.println(card2.info());   // 1K
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    public  SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        String kwang = "";
        if (isKwang) {
            kwang = "K";
        }
        return this.num + kwang;
    }

    // 다른 풀이
    public String info_2() {
        return num + (isKwang ? "K" : "");
    }
}
