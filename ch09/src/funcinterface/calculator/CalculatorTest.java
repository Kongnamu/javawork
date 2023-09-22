package funcinterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		//Calculator 변수 선언 - 변수는 add
		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		
		//Calculator()를 구현 - 람다식으로
		//덧셈, 뺄셈, 곱셉, 나눗셈 구현
		add = (n1, n2) -> num1 + num2;
		sub = (n1, n2) -> num1 - num2;
		mul = (n1, n2) -> num1 * num2;
		div = (n1, n2) -> num1 / num2;
		
		
		//Calculator() 호출 
		//덧셈, 뺄셈, 곱셈, 나눗셈 호출
		System.out.println("두 수의 합은 " + add.calculate(num1, num2) + "입니다.");
		System.out.println("두 수의 차는 " + sub.calculate(num1, num2) + "입니다.");
		System.out.println("두 수의 곱은 " + mul.calculate(num1, num2) + "입니다.");
		System.out.println("두 수의 나누기는 " + div.calculate(num1, num2) + "입니다.");
	}

}
