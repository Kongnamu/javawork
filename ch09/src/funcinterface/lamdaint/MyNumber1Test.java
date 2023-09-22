package funcinterface.lamdaint;

public class MyNumber1Test {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		MyNumber1 number;
		
		//변수의 람다식을 저장
		//calaculate()를 구현
		//매개변수가 1개인 경우 () 생략 가능
		/*number = (x) -> { //더하기 연산
			x = x + 10;
			System.out.println(x);
		};*/
		number = x -> System.out.println(x + 10);
		
		//calculate() 호출
		number.calculate(1);
		
		//제곱 구현
		number = n -> System.out.println(n * n);
		number.calculate(2);
	}

}
