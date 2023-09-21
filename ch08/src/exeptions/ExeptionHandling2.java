package exeptions;

public class ExeptionHandling2 {

	public static void printlength(String data) {
	//예외 처리
		try {
	//에러가 발생할 수있는 영역
		int count = data.length(); //글자수 세는 함수
		System.out.println("문자 수: " + count);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()); //에러처리 구문
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		
		printlength("지하철");
		printlength(null);
		
		System.out.println("[프로그램 종료]");
		
		
	}

}
