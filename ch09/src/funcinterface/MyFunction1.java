package funcinterface;

//함수형 인터페이스 사용 이유: 익명함수를 사용하기 위함
//함수형 인터페이스에서는 추상 메서드가 1개만 사용할 수 있음
@FunctionalInterface
public interface MyFunction1 {
	
	public void method();
	
	//public void method2();
}
