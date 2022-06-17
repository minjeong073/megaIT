package academy.java2.thread.test02;

public class StopWatch extends Thread {

	private boolean stop;
	private int count = 0;
	
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		
		while(!stop) {
			
			try {
				Thread.sleep(1000);
				count++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("걸린 시간 : " + (endTime - startTime) + "millis");
		System.out.println("걸린 시간 : " + count + "초");
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
