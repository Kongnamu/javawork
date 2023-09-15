package Operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 비교 연산자
		// 결과는 boolean 자료임
		System.out.println(4 < 5); //true
		System.out.println(4 > 5); //false
		System.out.println(4 == 5); //false, 같다
		System.out.println(4 != 5); //true, 같지않다
		
		System.out.println("====================================");
		
		// 변수를 사용하여 비교 연산하기
		int n1 =4, n2 = 5; // 변수 2개를 연속하여 선언
		System.out.println(n1 > n2); //false
		System.out.println(n1 < n2); //true
		System.out.println(n1 != n2); //true
		System.out.println(n1 == n2); //false
		
		System.out.println("====================================");
		
		//손흥민 선수는 미혼이다
		//결과 "미혼입니다."
		boolean isMerried = false;
		System.out.println(isMerried);
		
		//조건 연산자 : 비교값에 대해 ? 참 : 거짓
		String result = (isMerried == true) ? "기혼입니다." : "미혼입니다.";
		System.out.println("손흥민 선수는 " + result);

	}

}
