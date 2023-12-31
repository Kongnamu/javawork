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
		
		//book 인스턴스들의 물리적 주소
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
		
		//논리적 주소 일치 시키기 - hashCode(): Object 클래스가 제공
		
		

	}

}
