package input;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스 사용
		// 문자열 : nextLine()사용
		// 숫자 : nextInt()사용
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scanner.nextLine();  // nextLine 함수를 사용하여 문자열 입력
		
		System.out.print("나이 입력: ");
		int age = scanner.nextInt();
		System.out.println("이름 " + name + ", 나이" + age);
		
		scanner.close(); //닫기 <- 각 코드열에 !표시뜰때 해당 입력을 통해 닫아주는것이 좋음

	}

}
