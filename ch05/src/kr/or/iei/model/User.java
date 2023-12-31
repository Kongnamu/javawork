package kr.or.iei.model;


// 회원 클래스(자료형) 정의
public class User { //시험준비
	// 필드(속성)
	private String id;
	private String pwd;
	private String name;
	
	// 생성자 (set, get 사용시 생략 가능)
	public User () {}
	
	// 매개변수가 있는 생성자 // usertest2와 연동
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	//set(입력), get(출력) 함수 : private 인경우만 사용?
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
    public String getPwd() {
    	return pwd;
    }
    
    public void setName(String name) {
		this.name = name;
    }	
    
    public String getName() {
    	return name;
    }		
}
