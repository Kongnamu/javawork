package student;

public class School {
	private static School instance;
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

	//학번 생성 메서드
	public Student creatStudentNum() {
		Student studentNum = new Student();
		return studentNum;
	}
}

