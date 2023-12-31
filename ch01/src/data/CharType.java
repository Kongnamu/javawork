package data;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char, String
		// 복제 - alt + ctrl + 아래방향키
		// ASCII(Americal Standard Code for...)
		char alpha = 'A'; 
		System.out.println(alpha); //A문자형태로 출력
		System.out.println((int)alpha); // 65(아스키 코드값)으로 출력
		
		int alpha2 = 66;		
		System.out.println(alpha2); //66숫자형태로 출력
		System.out.println((char)alpha2); //B(아스키 코드값)으로 출력
		
		// 유니코드 - 16bit(2byte)
		char uniCode1 = '한';
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C'; //16진수 표기
		System.out.println(uniCode2); //한
		
		char uniCode3 = '\uAE00'; // 
		System.out.println(uniCode3); //글
		

	}

}
