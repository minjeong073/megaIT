package academy.java2.list.test04;

public class Product {
	
	private String name;
	private int price;
	private int count;
	
	public Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getPrice() {
		return price;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "(제품명 : " + this.name + " 가격 : " + this.price 
				+ " 재고 : " + this.count + ")";
	}

}
