package academy.java2.thread;

public class Ex01 {
	
	/*
	 Thread
	 멀티 쓰레드 : 여러개의 쓰레드를 CPU에서 각각 처리 
	 			-> 동시에 수행되는 것처럼 보임 (multi core)
     multi core : 실제로 각각이 쓰레드를 나눠서 처리	 			
	 
	 context switch : 여러개의 쓰레드 번갈아 처리 

	 */
	
	public static void main(String[] args) {
		
		
//		ThreadExtends thread1 = new ThreadExtends("@@@@");
//		ThreadExtends thread2 = new ThreadExtends("$$$$");
//		
//		thread1.start();	// start() 가 run() 메서드 호출
//		thread2.start();
		
		
		ThreadImplements ti1 = new ThreadImplements("@@@@");
		ThreadImplements ti2 = new ThreadImplements("####");
		
		// implements -> ti1.start() 없어서 실행 할 수 없음
		Thread thread1 = new Thread(ti1);
		Thread thread2 = new Thread(ti2);
		
		// 1. 내가 만든 객체를 생성자 안에 넣어서 thread 만들기
		// ** interface 를 사용하는 이유
		// implements Runnable 했기 때문에 ti1, ti2 가 
		// 생성자 안에 들어갈 수 있음
		
		thread1.start();
		thread2.start();
		
		
		
		System.out.println("main thread"); // 먼저 출력
		// 원래는 thread1.start() 가 먼저 코드 쓰여짐
		// 일 처리를 thread 에 넘기기 때문에 main 먼저 실행된 후 
		// thread.start() 가 실행됨

		
		// 다른 thread가 일이 끝날 때까지 기다리기
		// thread.join() 
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// --> thread1, thread2 가 끝날때까지 main thread 가 기다림
	
		System.out.println("마감");
		
		
	}
}
