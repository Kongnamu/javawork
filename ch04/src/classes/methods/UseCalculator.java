package classes.methods;

import classes.Calculator;

public class UseCalculator {

	public static void main(String[] args) {
		//정수형 Calculator 객체 생성
		Calculator calc = new Calculator();
		int num1 = 10, num2 = 2;
		int addval = calc.add (num1, num2);
		int subval = calc.sub (num1, num2);
		int mulval = calc.mul (num1, num2);
		int divval = calc.div (num1, num2);
		
		System.out.println(calc);
		
		System.out.println("두 수의 합: " + addval);
		System.out.println("두 수의 차: " + subval);
		System.out.println("두 수의 곱: " + mulval);
		System.out.println("두 수의 나누기: " + divval);

	}

}
