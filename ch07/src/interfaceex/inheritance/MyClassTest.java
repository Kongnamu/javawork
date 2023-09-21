package interfaceex.inheritance;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		
		//인터페이스 타입으로 형변환
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		System.out.println("================================");
		
		//X와 Y를 상속한 MyInterface의 객체(인스턴스)를 생성 (iClass)
		MyInterface iClass = myClass;
		iClass.x();
		iClass.y();
		iClass.method();
	}

}
