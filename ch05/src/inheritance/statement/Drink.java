package inheritance.statement; // 매출전표

public class Drink {
	//private로 인해 상속 불가할 경우 protected(상속할때만 사용) 사용
	protected String name; // 상품명
	protected int price;   // 가격
	protected int count;    // 수량
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		//금액 = 상품가격 x 수량
		return price * count;
	}
	
	public static void printTitle() { // 제목형 출력
		System.out.println("상품명\t가격\t수량\t금액");
		
	}
	
	public void printData() {
		System.out.println(name + "\t" + price + "\t" + count
		+ "\t" + getTotalPrice());
		
	}

}
