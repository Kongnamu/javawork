package student;

public class Student {
	//필드 학번
	private static int student = 100;
	private int studentNum;
	
	public Student() {
		student++;
		studentNum = student;
	}
	
	//학번 출력
	public int getStudentNum() {
		return studentNum;
	}
	
}
