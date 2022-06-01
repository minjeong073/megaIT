package academy.java2.Class;

public class Product {
	
	String name;
	int price;
	String expiration;
	
	int calculatePrice(int count) {
		return price * count;
	}
	// 2021-03-02, 2022-05-31
	
	void isAvailable(String now) {
		String[] expirations = expiration.split("-");
		int[] intExpirations = new int[3];
		for (int i = 0; i < expirations.length; i++) {
			intExpirations[i] = Integer.parseInt(expirations[i]);
		}
		
		String[] nows = now.split("-");
		int[] intNows = new int[3];
		for (int i = 0; i < nows.length; i++) {
			intNows[i] = Integer.parseInt(nows[i]);
		}
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (intExpirations[i] < intNows[i]) {
				System.out.println("판매 불가 상품");
				break;
			} else if (intExpirations[i] == intNows[i]){
				count++;	// 년월일이 모두 같을 경우
				continue;
			} else {
				System.out.println("판매 가능 상품");
				break;
			}
		}
		if (count == 3) {
			System.out.println("판매 가능 상품");
		}

	}
	
	void printInfo() {
		System.out.println("이름 : " + name + "\n가격 : " + price
				+ "\n유통기한 : " + expiration);
	}
}
