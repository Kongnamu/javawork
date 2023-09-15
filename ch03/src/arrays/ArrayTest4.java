package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 계산
		// 크기가 5인 실수형 배열 data 선언
		// 총점: total
		int total = 0;
		double average;
		double[] data = new double[5];
		
		// 저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		// 전체 조회
		for(int i = 0; i < data.length; i++) {
			total += data[i]; // 합계 계산
			System.out.println(data[i]);
		}
		average = total / data.length; // 평균 계산 (for문 밖에서 해야함)
		// 총점, 평균 출력
		System.out.println("합계: " + total);
		System.out.println("평균: " + average);
		

	}

}
