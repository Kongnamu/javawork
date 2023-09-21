package abstracts.template;

public class CarTest {

	public static void main(String[] args) {
		//Car car = new Car(); 추상 클래스는 객체 생성 불가
		//추상 클래스 타입으로 객체 생성
		Car manualCar = new ManualCar();
		manualCar.run();
		
		System.out.println("========================");
		
		Car myCar = new AiCar();
		myCar.run();
		
		
	}

}
