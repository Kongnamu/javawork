package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		
		//add활용해서 lg,삼성, 현대 넣은것과 같음
		List<String> list = Arrays.asList("LG", "Samsung", "Hyundai");
		//List<String> list1= new ArrayList();
		/*list.add("LG");
		list.add("Samsung");
		list.add("Hyundai");*/
		
		//comStream 생성 후 한번만 사용 가능, 다시 사용하려면 재생성 필요
		Stream<String> comStream = list.stream(); //list의 모든 객체를 가져옴
		comStream.forEach(com -> System.out.println(com)); //람다식으로 출력
		
		//for(), foreach() = 객체를 각각 출력
	}

}
