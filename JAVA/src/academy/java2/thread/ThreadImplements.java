package academy.java2.thread;

// extends : 원하는 클래스 상속 받을 수 없음
// --> implements 로 자유로워짐
public class ThreadImplements implements Runnable {

	private String resource;

	public ThreadImplements(String resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		// 특정 문자열을 10번 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(resource);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
