package constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("")("문자열 포맷", 객체)
		// 대응서식 - 정수: %d, 실수: %f, 문자: %s
		// decimal: 10진수
		// 줄바꿈 문자: \n, 텝(띄어쓰기): \t

		int year = 2023;
		System.out.printf("올해는 %d년입니다.\n", year);
		
		float weight = 63.7F;
		System.out.printf("그것의 무게는 %.2fkg입니다.\n", weight); // 소수점 두자리까지 표기하기 위에 .2를 붙힘
		
		String nick = "얼음공주";
		System.out.printf("그녀의 별명은 %s입니다.\n", nick);
		
		//'\t'사용
		//int num = 0; // 0으로 초기화
		//num += 1;
		
		String table = ""; //번 문자열 초기화
		table += "------------------------\n";
		table += "이름\t나이\t나라\n";
		table += "------------------------\n";
		table += "김정수\t32\t대한민국\n";
		table += "이순신\t52\t조선\n";
		table += "------------------------\n";
		
		System.out.println(table);
	}

}
