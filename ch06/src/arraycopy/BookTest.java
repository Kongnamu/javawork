package arraycopy;

public class BookTest {

	public static void main(String[] args) {
		//객체를 저장할 크기가 3인 배열 생성
		Book[] books = new Book[3];
		
		//객체 3개 생성
		Book book1 = new Book("개미", "베르나르 베르베르");
		Book book2 = new Book("티백산맥", "조정래");
		Book book3 = new Book("해리포터", "JK롤링");
		
		//인덱스 순서에 자리 저장
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		/* for(int i = 0; i < books.length; i++) {
			books[i] = book(i+1);
		} -> for문으로 시도했으나 오류발생 */
		
	    //1개 출력
		System.out.println(books[2]);
		
		System.out.println("=============================");
		
		//전체 출력
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
			//System.out.println(books[i].toString()); <- tostring 사용 가능
			
		}
		
		
		//System.out.println(book1);
		//System.out.println(book1.toString());
		

	}

}
