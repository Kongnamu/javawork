package statics.student;

public class Student {
	// 자동으로 학번 증가 (static 활용)
	static int serialNum = 1000; // 클래스 변수
	int id;                      // 인스턴스 변수(필드)
	String name;                 // 인스턴스 변수(필드)  -> new 사용   
	
	/* public Student() {
		serialNum++;
		id = serialNum;
	} */
	
	// 입력
	public void setId(int id) {
		this.id = id;
	}
	
	// 출력
	public int getId() {
		return id;
	}
	
}
