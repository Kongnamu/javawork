package streams.student; //for, foreach 사용

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		//문자열 배열
		String[] 과일 = {"사과", "배", "수박", "참외"};
		
		//for문을 사용하지 않고 foreach()문 사용: Stream 객체 얻어야함
		/*Stream<String> strStream = Arrays.stream(과일); 
		strStream.forEach(str -> System.out.println(str));*/
		Arrays.stream(과일).forEach(str -> System.out.println(str));
		
		//정수형 배열
		int[] number = {1, 2, 3, 4,};
		//Stream<Integer> numStream = Arrays.stream(number);
		//numStream.forEach(n -> System.out.print(n));
		
		//위의 과정을 한줄로 출력
		Arrays.stream(number).forEach(n -> System.out.println(n));
		
		System.out.println("=======================");
		
		//합계, 개수, 평균 구하기
		int sumVal = Arrays.stream(number).sum();
		int count = (int)Arrays.stream(number).count(); // count의 반환형이 long이므로 int로 다운캐스팅
		double avg = (double)sumVal / count;
		
		System.out.println("합계: " + sumVal);
		System.out.println("개수: " + count);
		System.out.println("평균: " + avg);
		
		
	}

}
