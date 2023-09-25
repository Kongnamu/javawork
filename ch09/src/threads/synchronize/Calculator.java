package threads.synchronize; //synchronize 사용

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000); //1초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//전체 스레드 이름
		System.out.println(Thread.currentThread().getName() +
				":" + this.memory);
		
	}
	
}
