package arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 배열 출력 (순서는 0부터 시작)
		// 변수
		String car1 = "Sonata";
		String car2 = "Morning";
		String car3 = "K7";
		String car4 = "Avante";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println("===============================");
		
		// 배열
		// 직접 저장: 중괄호 {}사용
		String[] cars = {"Sonata", "Morning", "K7", "k7", "Avante"};
		// String[] cars = new String []{"Sonata", "Morning", "K7", "k7"}; <- 이렇게도 가능
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars[4]);
		
		System.out.println("===============================");
		
		//배열의 크기 (개수로 따지면 4개) - 배열이름.length
		System.out.println("배열의 크기: " + cars.length);
		
		
		//for문을 사용해서 전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
