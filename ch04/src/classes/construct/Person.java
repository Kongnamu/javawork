package classes.construct;

//참조 자료형: Person 클래스 정의
//생성자 오버로딩: 이름이 같고 자료형이 다름
public class Person {
	String name;  // 이름
	float height; // 키
	float weight; // 몸무게
	
	//기본 생성자
	public Person( ) {}
	
	//매개변수가 있는 생성자
	public Person(String n) {
		name =n;
	}
	
	//매개변수가 있는 생성자(모든 필드)
	public Person(String n, float h, float w) {
		name = n;   // 외부(PersonTest)에서 입력된 이름을 저장
		height = h; // 외부(PersonTest)에서 입력된 키를 저장
		weight = w; // 외부(PersonTest)에서 입력된 무게를 저장
	}
	
	//함수 (method)
	public void showPersonInfo() {
		System.out.printf("이름: %s, 키: %.1f, 몸무게: %.1f\n", //문자열
				name, height, weight);                  //쉼표로 연결
	}

}
