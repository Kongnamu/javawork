package stringmethod;

public class StringTest {
	
	public static void main(String[] args) {
		//String 클래스를 사용하여 문자를 연결하면 내부의 문자열이 변경되지 않아
		//메모리가 많이 낭비됨
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 주소값: " + System.identityHashCode(javaStr));
		
		//문자를 연결하는 메서드: concat()
		javaStr = javaStr.concat(androidStr); // java + android
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));
	}

}
