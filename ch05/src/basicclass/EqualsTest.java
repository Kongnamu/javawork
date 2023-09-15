package basicclass;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("우영우");
		String name2 = new String("우영우");
		
		//위의 두 인스턴스의 주소 비교
		//해쉬 코드 - 메모리의 주소(십진수로 표기)
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		System.out.println(name1 == name2); // 주소비교: false
		System.out.println(name1.equals(name2)); // 문자열비교 : true
		
		System.out.println("=======================================");
		
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "개미");
		
		System.out.println(book1 == book2); // 주소비교: false
		System.out.println(book1.equals(book2)); // 문자열비교 : false
		
		//book 비교값을 true로 만들기위한 재정의 필요

		
		
	}

}
