package academy.java2.construct.test02;

public class Galaxy {
	private String company;
	private String name;
	private String phoneNumber;
	private String serialNumber;
	
	
	public Galaxy(String company, String name) {
		this.company = company;
		this.name = name;
		System.out.println(this.company + "에서 제조된 " + this.name + " 입니다.");
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
