package academy.java2.map.test07_2;

public class Goods {

	private String name;
	private int price;
	private String status;
	
	public Goods(String name, int price, String status) {
		this.name = name;
		this.price = price;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "물품명 : " + this.name + " 가격 : " + this.price 
				+ " 판매상태 : " + this.status ;
	}
}
