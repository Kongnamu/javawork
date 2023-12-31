package customers;

public class CustomerTest1 {

	public static void main(String[] args) {
		// 일반고객 1명, VIP고객 1명 객체 생성
		Customer lee = new Customer();		
		
		// 입력 (일반고객)
		lee.setCustomerId(1001);
		lee.setCustomerName("이순신");
		
		// 보너스포인트 출력
		int price = 10000; // 상품 구매가격
		lee.calcPrice(price);
		
		// 출력 (일반고객)
		System.out.println(lee.showCustomerInfo());
		
		System.out.println("===============================");
		
		VIPCustomer woo = new VIPCustomer(); // VIP 객체 생성
		
		//입력 (VIP)
		woo.setagentId(1010);
		woo.setCustomerName("우영우");
		woo.setagentId(7777);
		
		// 보너스포인트 출력
		price = 20000;
		woo.calcPrice(price);
		
		//출력 (VIP)
		System.out.println(woo.showCustomerInfo());
		

	}

}
