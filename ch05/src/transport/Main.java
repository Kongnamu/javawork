package transport;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("손흥민", 20000);
		Person p3 = new Person("김정수", 100000);
		
		// 버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus704 = new Bus(704);
		
		// 지하철 객체 생성
		Subway green = new Subway("2호선");
		
		// 버스 탑승
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p3.takeBus(bus704);
		
		// 지하철 탑승
		p1.takeSubway(green);
		p2.takeSubway(green);
		
		// 정보 출력
		p1.showPersonInfo();
		p2.showPersonInfo();
		p3.showPersonInfo();
		
		System.out.println("===========================");
		
		green.showSubwayInfo();
		bus100.showBusInfo();
		bus704.showBusInfo();


	}

}
