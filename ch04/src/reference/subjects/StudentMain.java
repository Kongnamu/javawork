package reference.subjects;

public class StudentMain {

	public static void main(String[] args) {
		//std1, std3 생성하기
		/* Student std1 = new Student(101, "홍길동");
		Student std2 = new Student(102, "우영우"); 
		
		//과목 추가
		std1.koreaSubject("국어", 90);
		std1.mathSubject("수학", 85);
		std2.koreaSubject("국어", 70);
		std2.mathSubject("수학", 100);
		
		
		//학생 정보 출력
		std1.showStudentInfo();
		std2.showStudentInfo(); */
		
		//객체 배열 사용하기
		Student[] students = {
			new Student(101, "홍길동"),	
			new Student(102, "우영우"),
			new Student(103, "손흥민")
		};
		
		// 저장
		students[0].koreaSubject("국어", 90);
		students[0].mathSubject("수학", 83);
		
		students[1].koreaSubject("국어", 72);
		students[1].mathSubject("수학", 90);
		
		students[2].koreaSubject("국어", 88);
		students[2].mathSubject("수학", 76);
        
		// 전체 출력
		for(int i=0; i < students.length; i++) {
			students[i].showStudentInfo();
		}
        System.out.println("===============================");
        
		// 향상된 for문
        for(Student stu : students) {
        	stu.showStudentInfo();
        }
	}

}
