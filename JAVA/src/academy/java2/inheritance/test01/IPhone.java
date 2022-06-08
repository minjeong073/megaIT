package academy.java2.inheritance.test01;

public class IPhone extends IPodTouch{

	private String number;

	public IPhone() {
		super.setModel("iPhone");
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	public void call(String number) {
		System.out.println(number + " 로 통화 중");
	}
	
	public void sendMessage(String number, String message) {
		System.out.println(number + " 로 " + message + " 전송");
	}
	
	
	@Override
	public String infoString() {
		return super.infoString() + "\n전화번호 : " + this.number;
	}

}
