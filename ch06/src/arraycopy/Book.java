package arraycopy;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	
	public String getbookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}	
	
	//문자열 출력 (to string)
	
	public String toString() {
		return bookName + ", " + author;
		
	}
}
