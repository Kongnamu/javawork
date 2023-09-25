package threads.threadname;

public class ThreadB extends Thread{
	//getName은 ThreadA를 말함
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용"); 
		}
	}

}
