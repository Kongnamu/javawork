package arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 크기가 4인 정수형 배열 선언
		int[] number = new int[4];
		int total = 0; // 합계 구하기 위한 변수 선언
		double average;// 평균 변수 선언만
		
		// 입력, 정수의 경우는 값 비어있을 시 '0'으로 출력됨
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		
		// 직접 초기화
		//int[] number = new int[] {10, 20, 30, 0};
		
		// 2번 인덱스 값 출력
		System.out.println(number[2]);
		
		// 전체 출력
		// 합계, 평균 구하기
		for(int i = 0; i < number.length; i++) {
			total += number[i]; // total = total + number[i]
			System.out.println(number[i]);
		}	
		average = total / number.length; // 평균 = 합계 / 개수
		
		System.out.println("합계: " + total); // 합계 출력
		System.out.println("평균: " + average); // 평균 출력
				
	}

}
