package threads.threadname;

public class ThreadA extends Thread{
	//getName은 ThreadA를 말함
	
	public ThreadA() {
		this.setName("ThreadA");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(this.getName() + "가 출력한 내용"); 
		
		}
	}

}
