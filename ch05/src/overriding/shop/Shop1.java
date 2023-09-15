package overriding.shop; //상속관계 (가게 본점, 지점 활용)

public class Shop1 extends HeadShop {
	//역세권
	public Shop1() {
		System.out.println("*** 역세권 매장입니다. ***");
	}

	@Override // 메서드 재정의
	public void 된장찌개() {
		System.out.println("된장찌개: 7,500원");
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개: 8,000원");
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥: 8,500원");
	}

}
