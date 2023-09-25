package threads.synchronize;

public class User2Thread extends Thread{
	//Calculator 참조
	private Calculator calculator;
	
	public User2Thread() {
		setName("userThread"); //스레드 이름 생성
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	//run() 재정의
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
