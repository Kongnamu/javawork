package funcinterface;

public class MyClass implements MyFunction1{

	@Override
	public void method() {
		System.out.println("hello");
	}
	//MyFunction1을 구현해서 "hello"를 출력하기
}
