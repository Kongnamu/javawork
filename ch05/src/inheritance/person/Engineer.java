package inheritance.person;

// Engineer가 Person을 상속 받음
public class Engineer extends Person{
	int companyId;
	
	//매개변수가 있는 생성자를 상속받을때 super() 사용
	public Engineer(String name, int age, int companyId) {
		super(name, age); // 부모클래스
		this.companyId = companyId;// 자식클래스의 필드 초기화
	}
	
	public int getCompanyId() {
		return companyId;
	}
}
