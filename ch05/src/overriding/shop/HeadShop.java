package overriding.shop; //상속관계 

public class HeadShop {
	
	public HeadShop() {} // 생성자 명시: 생략 가능
	
	public void 된장찌개() {
		System.out.println("된장찌개: 7,500원");
	}
	      
	public void 김치찌개() {
		System.out.println("김치찌개: 8,000원");
	}
	
	public void 비빔밥() {
		System.out.println("비빔밥: 8,500원");
	}

}
