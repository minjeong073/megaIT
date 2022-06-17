package academy.java2.thread.test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		StopWatch stopWatch = new StopWatch();
		
		System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다.");
		
		Scanner scan = new Scanner(System.in);
		
		do {
			String str = scan.next();
			
			if (str.equals("시작")) {
				stopWatch.start();
				stopWatch.setStop(false);
			
			} else if (str.equals("그만")) {
				stopWatch.setStop(true);
			}
		} while(stopWatch.isAlive());
		 
		
	}
}
