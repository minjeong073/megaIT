package academy.java2.map.test07;

public class Test07 {
    public static void main(String[] args) throws InvalidStatusException {

        Market market = new Market();

//        try {
//            market.create(new Goods("시계", 100_000, "판매"));
//        } catch (InvalidStatusException e) {
//            String message = e.getMessage();
//            System.out.println(message);
//        }
        market.create(new Goods("시계", 100_000, "판매중"));

        market.read();

        market.update("시계", 120_000);

        market.update("가방", "예약중");

        market.delete("시계");


    }
}
