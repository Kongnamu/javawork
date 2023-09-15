package inheritance.q4; //교재 연습문제: 오류 찾기

public class Employee {
	public String name;
	public String grade;
	
	public Employee(String name) {
		this.name = name; // ; 미표기 오류
	}
}
