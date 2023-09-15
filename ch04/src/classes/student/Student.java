package classes.student;

//참조(reference) 자료형
public class Student {
//클래스 내부에서는 변수를 필드(field) 라고 한다.
//메인함수를 제외하고 연동가능한 형태로 작업
	String name;   // 학생 이름
	int studentId; // 학번
	int grade;     // 학년
	
	public Student() {} // 기본 생성자 : 필수로 있지만 설정하지 않아도 존재한다.
	                    // 함수가 아니므로 반환형(void)가 없음, 클래스 이름과 같다.
	                    // 기본 생성자(매개변수가 없는 생성자)는 생략 가능(컴파일러가 자동 생성함)
	
	//학생의 정보를 출력하는 함수(method)
	public void showStudentInfo() {
		System.out.println("이름: " + name + 
				", 학번" +studentId + ", 학년" + grade);
	}
}
