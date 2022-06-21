package academy.java2.map.test07;

import java.util.List;

public class Goods {

    private String name;
    private int price;
    private String status;
    private List<String> salesStatus;

    public Goods(String name, int price, String status) throws InvalidStatusException {
        this.name = name;
        this.price = price;
        if (isValidState(status)) {
            this.status = status;
        } else {
            System.out.println("판매상태가 유효하지 않습니다");
            return;
        }

    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "물품명 : " + name + '\'' +
            ", 가격 : " + price +
            ", 판매상태 : '" + status + '\'' ;
    }

    public boolean isValidState(String state) {
        salesStatus.add("판매중");
        salesStatus.add("판매완료");
        salesStatus.add("예약중");

        return salesStatus.contains(state);
    }
}
