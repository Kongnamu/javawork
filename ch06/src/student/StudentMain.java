package student;

public class StudentMain {

	public static void main(String[] args) {
		School school = School.getInstance();
		
		Student 김정수 = school.creatStudentNum();
		Student 손흥민 = school.creatStudentNum();
		Student 임영웅 = school.creatStudentNum();
		
		//학번 출력
		System.out.println("김정수 학생 학번: " + 김정수.getStudentNum());
		System.out.println("손흥민 학생 학번: " + 손흥민.getStudentNum());
		System.out.println("임영웅 학생 학번: " + 임영웅.getStudentNum());

		//각 객체의 주소
		System.out.println(school);
		System.out.println(김정수);
		System.out.println(손흥민);
		System.out.println(임영웅);
	}

}
