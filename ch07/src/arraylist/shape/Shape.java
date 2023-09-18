package arraylist.shape; // 교재 279쪽 Q5

public class Shape {
	public void draw() {
		System.out.println("Shape");
	}

}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("Triangle");
	}
}