package generic;

public class ProductTest {

	public static void main(String[] args) {
		//Product 객체 생성
		Product<TV, String> prod1 = new Product();
		Product2<Car, String> prod2 = new Product2();
		
		//인스턴스 생성
		TV tv = new TV();
		Car car = new Car();
		
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		prod2.setCarkind(car);
		prod2.setCarmodel("전기차");
		
		tv.making();
		System.out.println(prod1.getModel());
		
		System.out.println("======================");
		
		car.carMaking();
		System.out.println(prod2.getCarmodel());
		
		//자동차를 생성해서 모델명을 출력하세요
		
		}

}
