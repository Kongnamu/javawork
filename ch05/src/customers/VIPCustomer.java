package customers;

public class VIPCustomer extends Customer{
	private int agentId; // 전문 상담원
	double saleRatio;    // 구매 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		saleRatio = 0.1;   // 10%
		bonusRatio = 0.05; // 5%
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		customerGrade = "VIP";
		saleRatio = 0.1;   // 10%
		bonusRatio = 0.05; // 5%
	}
	
	public void setagentId(int agentId) {
		this.agentId = agentId;
	}
	
	//구매 가격 = 상품 가격 - (상품가격 x 구매할인율)
	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
// 정보 출력
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n전문 상담원 ID는 " + agentId + 
				"입니다.";
	}

}
