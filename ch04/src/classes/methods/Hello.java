package classes.methods;

public class Hello {
	
	//sayHello() 함수(method) 정의
	//매서드 오버로딩: 함수의 이름은 같고 매개변수가 다름
	public void sayHello() {
		System.out.println("안녕~");
		
	}
	
	public void sayHello(String name) {
		System.out.println("안녕~" + name);
	}

}
