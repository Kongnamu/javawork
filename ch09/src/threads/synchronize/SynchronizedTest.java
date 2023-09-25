package threads.synchronize;

public class SynchronizedTest {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		//user1Thread 객체 생성
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		//user2Thread 객체 생성
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
	}

}
