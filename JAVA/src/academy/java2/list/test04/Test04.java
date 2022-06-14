package academy.java2.list.test04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		List<Product> store = new ArrayList<>();
		
		System.out.println("1. 제품 추가");
		store.add(new Product("새우깡", 1200, 150));
		store.add(new Product("육개장", 850, 30));
		store.add(new Product("신라면", 800, 15));
		store.add(new Product("천마표팝콘", 1500, 0));
		
		System.out.println(store);
		System.out.println();
		
		
		System.out.println("2. 제품 제거");
		
		Iterator<Product> iter = store.iterator();
		
		while(iter.hasNext()) {
			if (iter.next().getCount() == 0) {
				iter.remove();
			}
		}
		System.out.println(store);
		System.out.println();
		
		
		System.out.println("3. 제품 판매");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("상품명 : ");
		String inputName = scan.nextLine();
		System.out.print("개수 : ");
		int inputCount = scan.nextInt();
		
		int result = 0;
		
		iter = store.iterator();
		while(iter.hasNext()) {
			Product product = iter.next();
			
			if (product.getName().equals(inputName)) {
				product.setCount(product.getCount() - inputCount);
				result = product.getPrice() * inputCount;
			}
		}
		System.out.println("가격 : " + result);
		System.out.println(store);
		System.out.println();
		
		
		System.out.println("4. 재고 관리");
		
		iter = store.iterator();
		while (iter.hasNext()) {
			Product product = iter.next();
			if (product.getCount() <= 30) {
				System.out.println(product);
			}
		}
		
	}
}
