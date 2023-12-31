package hiding.accounts;

// 은행 통장 계좌 자료형 생성
// 정보 은닉 - private 사용

public class Account {
	private String ano;     // 계좌번호
	private String owner;   // 계좌번호
	private int balance; // 잔고
	
// 기본 생성자
	public Account() {}
	
// 매개변수가 있는 생성자	
	public Account(String ano, String own, int bal) {
		this.ano = ano; // this 키워드 사용: 변수와 값 동일하게 작성 가능
		owner = own;
		balance = bal;
	}
	
// get(), set() method 생성
// 만드는 방법
// 1. set -> 필드이름()
	// 계좌번호
	public void setAno(String a) { // 매개변수로 계좌번호 전달 (저장)
		ano = a;
	}
	
	public String getAno() { // 출력
		return ano;
	}
	
    // 계좌주
	public void setOwner(String own) { // 저장
		owner = own;
	}
	
	public String getOwner() { // 출력
		return owner;
	}
	
	// 계좌 잔고
	public void setBalance(int bal) { // 저장
		balance = bal;
	}	
	
	public int getBalance() { // 출력
		return balance;
	}

}
