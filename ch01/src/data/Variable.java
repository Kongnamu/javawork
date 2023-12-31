package data;

public class Variable {

	public static void main(String[] args) {
		// 변수를 사용
		// 변수 선언 방법 : 자료형(int) 변수이름(year)
		int year = 2023; // 정수 자료형 변수 year를 선언함, 2023을 대입
		System.out.println(year + "년"); //숫자와 문자를 더하기(연결하기)
		

        int month = 9; //변수의 초기화 (선언과 동시에 값을 대입함)
        System.out.println(month + "월");
        
        int day = 5;
        System.out.println(day + "일");
        
        //손흥민은 3학년 2반입니다.
        //변수 : 이름(name), 학년(grade), 반(SchoolClass)상기
        /*변수 이름 명령시 주의할 점
         1. class와 같이 이미 정해진 명령어 (예약어)는 사용 불가
         2. 변수이름에 공백(문자)을 사용할 수 없음
         3. 숫자로 시작할 수 없음
        */
        //문자열 자료형: String / 한 문자 자료형: char
        String name = "손흥민";
        int grade = 3;
        int SchoolClass = 2;
        System.out.println(name + "은 " + grade + "학년 "
        + SchoolClass + "반 입니다.");
	}

}
