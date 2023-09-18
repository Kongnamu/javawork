package arraylist.shape; // 교재 279쪽 Q5

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>(); 
		
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape s : list) {
			s.draw();
		}

	}

}
