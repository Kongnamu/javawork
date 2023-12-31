package data;

public class ByteTypeTest {

	public static void main(String[] args) {
		// byte 관련 자료형
		// 정수 자료형 : byte, short, int, long
		// byte(8bit)의 범위 : -128 ~ 127
		// short(16bit)의 범위 : -32768 ~ 32767
		byte bData = -128;
		System.out.println(bData);
		
		//byte bData2 = 128; // 범위 초과
		//System.out.println(bData2);

		//System.out.println(256*256/2); // short의 범위 계산
		short sData1 = 128;
		System.out.println(sData1);
		
		System.out.println("===============================");
		
		//10진수, 2진수, 16진수 출력
		//객체의 이름과 주소를 알고 싶을때
		ByteTypeTest test = new ByteTypeTest();
		System.out.println(test);
		
		int num = 10;       // 10진수
		int bNum = 0b1010;  // 2진수를 표기할때 접두어로 0b를 붙힌다.
		int hNum = 0xA;     // 16진수를 표기할때 접두어로 0x를 붙힌다.
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(hNum);
		
		//10진수 5를 2진수 32bit로 표기
		int val1 = 0b00000000000000000000000000000101; // 5
		System.out.println(val1);
		//10진수 -5를 2진수 표기  
		//1. 보수로 만듦, 2. 1을 더함
		//int val2 = 0b11111111111111111111111111111010; // -6
		int val2 = 0b11111111111111111111111111111011; // 1을 더함
		System.out.println(val2);
		
	}


}
