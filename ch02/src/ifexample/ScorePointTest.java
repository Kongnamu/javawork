package ifexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		// 점수에 따른 학점 출력 프로그램
		// 변수: 점수(score-정수형), 학점(grade-문자형)
		// A학점(90~100점)
		// B학점(80~90점)
		// C학점(70~80점)
		// D학점(60~70점)
		// F학점(0~60점)
		
		Scanner scan = new Scanner(System.in); // 객체 scan 생성 (참조 자료형)
		
		
		//입력
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt(); // 사용자 입력 받기
		char grade = 'A'; // char형은 한 문자(''사용)
				
		//연산
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score < 90) {
			grade = 'B';
		}else if(score >= 70 && score < 80) {
			grade = 'C';
		}else if(score >= 60 && score < 70) {
			grade = 'D';
		}else if(score >= 0 && score < 60) {
			grade = 'F';
		}			
		
		//출력
		System.out.println(grade + "학점입니다.");
		scan.close();
	}

}
