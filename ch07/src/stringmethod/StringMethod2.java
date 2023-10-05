package stringmethod;

public class StringMethod2 {

	public static void main(String[] args) {
		//indexOf() 검색에 도움을 줌
		//문자열이 시작되는 인덱스를 리턴한다.
		String str = "Hello World java";
		
		int val = str.indexOf("Hello"); // 앞에서부터 찾음
		System.out.println(val);
		
		int val2 = str.lastIndexOf("java"); // 뒤에서부터 찾음
		System.out.println(val2);
		
		int val3 = str.indexOf("ok"); // 찾는 문자가 없으면 -1을 리턴함
		System.out.println(val3);
		
		//조건문 만들기
		String subject = "자바 프로그래밍";
		
		if(subject.indexOf("자바") != -1) { //"자바"가 검색이 된다면 (>= 0)
			System.out.println("자바와 관련된 책이군요!");
		}else { // index == -1 이면
			System.out.println("자봐와 관련이 없는 책이군요!");
		}
	}

}
