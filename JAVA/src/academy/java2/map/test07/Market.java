package academy.java2.map.test07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Market {

    private Map<String, Goods> goodsMap;
    private Set<String> goodsSet;
    private Iterator<String> iter;

    public Market() {
        goodsMap = new HashMap<>();
    }

    public void create(Goods goods) {

        if (isExist(goods.getName())) {
            System.out.println("등록된 상품이 존재합니다.");
        } else {
            goodsMap.put(goods.getName(), goods);
            System.out.println("등록 성공");
        }
    }


    public void read() {
        if (goodsMap.isEmpty()) {
            System.out.println("비어있습니다");
        } else {
            goodsSet = goodsMap.keySet();
            iter = goodsSet.iterator();
//
//            while(iter.hasNext()) {
//                System.out.println(goodsMap.get(iter.next()));
//            }

            System.out.println(this.goodsMap.get(iter.next()));
        }

    }

    public void update(String name, int price) {
        if (goodsMap.containsKey(name)) {

        }
    }

    public void update(String name, String status) {

    }

    public void delete(String name) {
        if (!isExist(name)) {
            System.out.println("삭제할 상품이 존재하지 않습니다");
        } else {
            goodsSet = goodsMap.keySet();
            iter = goodsSet.iterator();

            while(iter.hasNext()) {
                String iterNext = iter.next();
                if (iterNext.equals(name)) {
                    iter.remove();
                    System.out.println("삭제 되었습니다");
                }
            }
        }
    }

    public boolean isExist(String name) {
        return goodsMap.containsKey(name);
    }
}

