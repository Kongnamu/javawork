package wrapper;

public class IntegerTest {

	public static void main(String[] args) {
		//int num1 = 100; // 기본 자료형
		Integer num1 = 100; // integer: 클래스
		int num2 = 200;
		
		//num1이 객체이므로 메서드 접근 가능
		int sum = num1.intValue() + num2;
		
		System.out.println(num1);
		System.out.println(sum);
		
		//valueof() -> 괄호안의 매개변수, 정수나 문자열을 숫자로 변환
		Integer num3 = Integer.valueOf("123");
		System.out.println(num3);
		
		//parseInt() -> 문자열을 숫자로 변환
		int num4 = Integer.parseInt("456");
		System.out.println(num4);
		

	}

}
