package transport;

public class Person {
	// 필드
	String name; // 이름
	int money;   // 가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 버스를 탄다.
	public void takeBus(Bus bus) {
		bus.take(1500);     // 버스 요금 지불
		this.money -= 1500; // 1500원 감소	
	}
	
	// 지하철을 탄다.
	public void takeSubway(Subway subway) {
		subway.take(1350);
		this.money -= 1350;
	}
	
	// 사람의 정보
	public void showPersonInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}

}
