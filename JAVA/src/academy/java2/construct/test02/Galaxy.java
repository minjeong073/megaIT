package academy.java2.construct.test02;

public class Galaxy {
	private String company;
	private String name;
	private String phoneNumber;
	private String serialNumber;
	
	// 생성될 때 제조사와 제품 이름은 정해지기 때문에
	// serialNumber 만 입력받도록
	public Galaxy(String serialNumber) {
		this.company = "삼성";
		this.name = "Galaxy";
		System.out.println(this.company + "에서 제조된 " + this.name + " 입니다.");
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	
	
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "로 전화를 겁니다 뚜르르르...");
	}

	
	public void message(String phoneNumber, String message) {
		System.out.println(phoneNumber + "로 \"" + message 
				+ "\" 메시지를 전송합니다.");
	}
	
}
