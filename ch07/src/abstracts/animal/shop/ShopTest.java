package abstracts.animal.shop;

public class ShopTest {

	public static void main(String[] args) {
		//추상 클래스는 객체 생성이 안됨
		//부모 타입으로 객체 생성
		HeadShop shop1 = new Shop1(); // HeadShop(); -> Shop1로 수정
		shop1.된장찌개();
		shop1.김치찌개();
		shop1.비빔밥();
		
		System.out.println("======================");
		
		HeadShop shop2 = new Shop2();
		shop2.된장찌개();
		shop2.김치찌개();
		shop2.비빔밥();
		
	}

}
