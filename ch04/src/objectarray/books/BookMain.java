package objectarray.books;

public class BookMain {

	public static void main(String[] args) {
		Book[] library = new Book[3];
		
		/* for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}  // -> null값 나옴

		// 객체 생성(배열에 저장)
		library[0] = new Book("자바 프로그래밍 입문", "박은종");
		library[1] = new Book("웹 표준의 정석", "고경희");
		library[2] = new Book("스프링부트", "채규태"); */
		
	    Book[] library1 = {
	    		new Book("자바 프로그래밍 입문", "박은종"),
	    		new Book("웹 표준의 정석", "고경희"),
	    		new Book("스프링부트", "채규태")
	    };
		
		// 출력
		System.out.println(library1[0].showBookInfo());
		
		// 전체 출력
		for(int i=0; i<library1.length; i++) {
		    System.out.println(library1[i].showBookInfo());
		}
		System.out.println("=================================");
		
		// 향상된 for문
		// for(자료형 변수 : 배열) {}
	    for(Book book : library1)
	    	System.out.println(book.showBookInfo());
		
	}

}
