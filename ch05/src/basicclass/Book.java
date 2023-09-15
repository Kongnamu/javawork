package basicclass; // toString 활용

public class Book{
	int bookNumber;   // 책 번호
	String bookTitle; // 책 제목
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		
	}

	//메서드 재정의 (toString)
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	//메서드 재정의 (equals)
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}
