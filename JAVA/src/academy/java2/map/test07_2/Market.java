package academy.java2.map.test07_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market {

	private List<Goods> goodsList;
	
	public Market() {
		goodsList = new ArrayList<>();
	}
	
	public void create(String name, int price, String state) {
		if (!isValidStatus(state)) {
			System.out.println("판매상태가 유효하지 않습니다");
			return;
		} 
		
		Iterator<Goods> iter = goodsList.iterator();
		
		while(iter.hasNext()) {
			Goods goods = iter.next();
			if (goods.getName().equals(name)) {
				System.out.println("등록된 상품이 존재합니다");
				return;
			}
		}
		goodsList.add(new Goods(name, price, state));
	}

	
	public void read() {
		if (goodsList.isEmpty()) {
			System.out.println("비어있습니다");
			return;
		}
		System.out.println(goodsList);
	}

	
	public void update(String name, int price) {
		for(Goods goods : goodsList) {
			if (name.equals(goods.getName())) {
				goods.setPrice(price);
				System.out.println("가격 변경 완료");
				break;
			}
		}
		
	}
	
	public void update(String name, String state) {
		if (!isValidStatus(state)) {
			System.out.println("판매상태가 유효하지 않습니다");
			return;
		}
		for(Goods goods : goodsList) {
			if (name.equals(goods.getName())) {
				goods.setStatus(state);
				System.out.println("상태 변경 완료");
				break;
			}
		}
		
	}
	
	public void delete(String name) {
		Iterator<Goods> iter = goodsList.iterator();
		
		while(iter.hasNext()) {
			Goods goods = iter.next();
			
			if (name.equals(goods.getName())) {
				iter.remove();
				System.out.println("삭제 완료");
			}
		}
	}

	public boolean isValidStatus(String state) {
		if (state.equals("판매중") || state.equals("판매완료") || state.equals("예약중")) {
			return true;
		}
		return false;
	}
}
