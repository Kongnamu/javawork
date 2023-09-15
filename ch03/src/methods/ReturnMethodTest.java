package methods;

public class ReturnMethodTest {

	// return(호출한 곳으로 보낸다)이 있는 함수(변환 자료형): int, String
	
	public static void main(String[] args) {
		int n1 = 10, n2 = 20; // 지역 변수: local 변수
		// 더하기 함수 호출
		int result = add(n1, n2);
		System.out.println("결과값1: " + result);
		//int sum = n1 + n2;
		//System.out.println(sum);
		
		//제곱수 함수 호출
		int result2 = square(n1);
		System.out.println("결과값2: " + result2);
		
		//메시지 함수 호출
		String msg = message();
		System.out.println(msg);
	}
	// return이 있고 매개변수가 2개인 함수이름: add()
	public static int add(int a, int b) {
		return a + b;
	}
	
	// return이 있고 매개변수 1개인 함수 (제곱수)
	public static int square(int x) {
		return x * x;
	}

	// return이 있고 매개변수가 없는 함수
	public static String message() {
		String msg = "행운을 빌어요!";
		return msg = "행운을 빌어요!";
	}
}
