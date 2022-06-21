package academy.java2.map.test07_1;

public class Test07 {

    public static void main(String[] args) {

        Market market = new Market();

        market.create("시계", 100_000, "판매중");
        market.create("시계1", 150_000, "판매");
        market.create("시계", 120_000, "판매중");

        market.read();

        market.update("시계", 120_000);
        market.read();

        market.update("시계", "예약중");
        market.read();

        market.delete("시계1");

        market.delete("시계");
        market.read();


    }
}
