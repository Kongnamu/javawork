package inheritance.transeport;

public class Main {

	public static void main(String[] args) {
		// Person 객체 생성
		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호", 20000);
		Person jungsu = new Person("김정수", 30000);
		
		//Bus 객체 생성
		Bus bus100 = new Bus("bus100");
		
		//Taxi 객체 생성
		Taxi kakaoTaxi = new Taxi("카카오택시");
		
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		jungsu.take(kakaoTaxi, 8800);
		
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		jungsu.showPersonInfo();
		
		System.out.println("===================================");
		
		bus100.showInfo();
		kakaoTaxi.showInfo();
		
	}

}
