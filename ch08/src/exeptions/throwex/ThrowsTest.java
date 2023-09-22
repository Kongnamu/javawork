package exeptions.throwex;

public class ThrowsTest {

	public static void main(String[] args) {
		//함수를 호출한 곳에서 예외 처리함
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.toString());
		}

	}
	
	public static void findClass() throws ClassNotFoundException {
		//컴파일러가 오류 체크 (일반 예외)
		Class.forName("java.lang.System2");
	}

}
