package abstracts.template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
	
	/* public void run() { //car 클래스에서 fianl 로 인해 오류 발생
		drive();
		stop(); 
	} */
}
