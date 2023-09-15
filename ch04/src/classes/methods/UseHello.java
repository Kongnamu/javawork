package classes.methods;

public class UseHello {

	public static void main(String[] args) {
		// hello 클래스 사용하고 싶을 때
		Hello say = new Hello();
		say.sayHello(); //함수 호출
		say.sayHello("Elsa");
		say.sayHello("장그레");

	}

}
