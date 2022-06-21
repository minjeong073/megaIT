package academy.java2.map.test07_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market {

    private List<Goods> goodsList;
    private Iterator<Goods> iter;

    public Market() {
        goodsList = new ArrayList<>();
    }

    public void create(String name, int price, String status) {
        // 판매상태 확인
        if (!isValidStatus(status)) {
            return;
        }
        // 중복된 상품명 확인
        if (isExistGoods(name)) {
            System.out.println("등록된 상품이 존재합니다");
            return;
        }

        goodsList.add(new Goods(name, price, status));
        System.out.println("'" + name + "' 상품이 등록되었습니다");
    }

    public void read() {
        // 비어있는지 확인
        if (goodsList.isEmpty()) {
            System.out.println("비어있습니다");
            return ;
        }

        iter = goodsList.iterator();
        while(iter.hasNext()) {
            Goods goods = iter.next();
            System.out.println("< 상품 리스트 >");
            System.out.println(goods);
        }
    }

    public void update(String name, int price) {
        // 존재하는 상품인지 확인
        if (!isExistGoods(name)) {
            System.out.println("수정할 상품이 존재하지 않습니다");
            return;
        }
        
        iter = goodsList.iterator();
        while(iter.hasNext()) {
            Goods goods = iter.next();
            if (goods.getName().equals(name)) {
                goods.setPrice(price);
                System.out.println("수정되었습니다.");
            }
        }
    }

    public void update(String name, String status) {
        // 존재하는 상품인지 확인
        if (!isExistGoods(name)) {
            System.out.println("수정할 상품이 존재하지 않습니다");
            return;
        }

        // 판매상태 확인
        if (!isValidStatus(status)) {
            return;
        }

        iter = goodsList.iterator();
        while(iter.hasNext()) {
            Goods goods = iter.next();
            if (goods.getName().equals(name)) {
                goods.setStatus(status);
                System.out.println("수정되었습니다.");
            }
        }
    }

    public void delete(String name) {
        // 존재하는 상품인지 확인
        if (!isExistGoods(name)) {
            System.out.println("삭제할 상품이 존재하지 않습니다");
            return;
        }

        iter = goodsList.iterator();
        while(iter.hasNext()) {
            Goods goods = iter.next();
            if (goods.getName().equals(name)) {
                iter.remove();
                System.out.println("삭제되었습니다");
            }
        }
    }
    
    // 판매 상태 유효성 검사
    public boolean isValidStatus(String status) {
        List<String> statusList = new ArrayList<>();

        statusList.add("판매중");
        statusList.add("판매완료");
        statusList.add("예약중");
        
        if (!statusList.contains(status)) {
            System.out.println("판매상태가 유효하지 않습니다");
            return false;
        }
        return true;
    }

    // 존재하는 상품 확인
    public boolean isExistGoods(String name) {
        iter = goodsList.iterator();

        while(iter.hasNext()) {
            if (iter.next().getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
