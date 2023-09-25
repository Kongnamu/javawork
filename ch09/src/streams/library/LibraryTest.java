package streams.library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		Stream<Book> stream = bookList.stream();
		stream.map(b -> b.getName())
			.forEach(p -> System.out.println(p));
		
		int total = bookList.stream()
				.mapToInt(b -> b.getPrice())
				.sum();
		System.out.println("====== 총 합계금액 출력 ======");
		
		System.out.println("책의 총 합계 금액은 " + total + "원 입니다.");
		
		System.out.println("====== 20000원 이상인 책의 이름 출력 ======");
		
		bookList.stream()
				.filter(b -> b.getPrice() >= 20000)
				.map(b -> b.getName())
				.sorted()
				.forEach(s -> System.out.println(s));
	}

}
