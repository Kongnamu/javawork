package objectarray.books;

public class Book {
	//필드
	private String bookName;
	private String author;
	
	// 생성자
    public Book(String bookName, String author) {
    	this.bookName = bookName;
    	this.author = author;
    }
    
    //책의 정보 출력
    public String showBookInfo() {
    	// System.out.println(bookName + ", " + author);
    	return bookName + "," + author;
    }
}
