package singleton.car;

public class CarTest {

	public static void main(String[] args) {
		//싱글톤이므로 객체는 1개임
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourMorning = factory.createCar();
		
		System.out.println("신차 번호: " + mySonata.getCarNum() + " 소나타");
		System.out.println("신차 번호: " + yourMorning.getCarNum() + " 모닝");

	}

}
