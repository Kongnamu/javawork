package singleton.car;

public class Car {
	//필드: 차량번호
	private static int serialNum = 1000; // 클래스 변수, 차 신규마다 차량번호가 나와야하므로 static 사용
	private int carNum; // 차량 번호: 인스턴스 변수
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	//자동차 번호 출력
	public int getCarNum() {
		return carNum;
	}

}
