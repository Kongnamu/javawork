package reference.subject2;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(101, "홍길동");
		
		kim.addSubject("국어", 90);
		kim.addSubject("수학", 85);
		kim.addSubject("과학", 78);
		
		
		
		kim.showStudentInfo();
		
		

	}

}
