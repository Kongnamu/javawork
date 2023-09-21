package nestedclass; //중첩 class

class A{
	A() {System.out.println("A 객체 생성");}
	
	//멤버 클래스
class B{
	int field1;
	//static in field2; //내부 클래스에서는 static 변수가 생성되지 않음
	B(){System.out.println("B 객체 생성");}
	void method1() {}
	}
	
	//내부 정적 멤버 클래스
	static class C{
		int field;
		static int field2;
		
		C(){System.out.println("C 객체 생성");}
		void method1() {}
		static void method2() {}
	}
	
	//메서드 내부 로컬 클래스 사용
	void method() {
		class D{
			int field;
			D(){System.out.println("D 객체 생성");}
			void method1() {};
		}
		//d 객체 생성
		D d = new D();
		d.field = 10;
		d.method1();
	}
}

public class NestedClassTest {

	public static void main(String[] args) {
		//a 객체 생성
		A a = new A();
		
		//b 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//c 객체 생성
		A.C c = new A.C();
		c.field = 2;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//D 클래스의 method 호출
		a.method();
	}

}
