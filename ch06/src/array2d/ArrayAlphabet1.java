package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		// for문 출력
		/* char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		
		char c2 = 66;
		System.out.println(c2); */
		System.out.println("== 일반 for문을 사용하여 알파벳 출력 ==");
		char c;
		for(c = 65; c <= 90; c++ ) { //65는 코드값 (아스키 코드에 따라 출력)
			System.out.print(c + " ");
		}
		System.out.println("\n변수의 마지막 값: " + (char)(c-1));
		
		System.out.println("== 알파벳을 배열에 저장하고 출력 ==");
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//alphabets[0] = ch;
		//System.out.println(alphabets[0]); // A
		//ch++; // ch = ch + 1 // <--- 더 간단히 가능 
		//alphabets[1] = (char)(ch + 1); // 자바에서 덧셈연산하면 int로 바뀌기 때문에 char로 한것임
		//alphabets[1] = ch;
		//System.out.println(alphabets[1]); // B
		
		//알파벳 배열에 저장
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		//알파벳 출력
		for(int i = 0; i < alphabets.length; i++) {
			System.out.print(alphabets[i] + " ");
		}

	}

}
