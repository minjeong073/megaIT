package academy.java2.thread;

public class ThreadExtends extends Thread {

	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
	}
	
	
	// thread 로 수행시킬 코드
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
