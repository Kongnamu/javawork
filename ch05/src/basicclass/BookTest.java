package basicclass; // toString 활용

public class BookTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(100, "개미");
		System.out.println(book1);
		System.out.println(book1.toString());
		
		//String msg = "개미";
		String msg = new String("개미");
		System.out.println(msg.toString());
		
	}

}
