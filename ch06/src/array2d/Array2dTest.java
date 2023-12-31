package array2d;

public class Array2dTest {

	public static void main(String[] args) {
		// 정수형 2차원 배열 선언 : 출력시 2중 for문 필요
		int[][] arr = new int[2][3]; // 행:2, 열:3
		
		System.out.println(arr.length);    // 행의 크기
		System.out.println(arr[0].length); // 1열의 크기
		System.out.println(arr[1].length); // 2열의 크기
		
		// 전체 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 줄바꿈
		}

		// 배열에 값을 저장
		arr[0][0] = 1; 
		arr[0][1] = 2; 
		arr[0][2] = 3; 
		arr[1][0] = 4; 
		arr[1][1] = 5; 
		arr[1][2] = 6;
		
		// 배열에 값을 저장2 (선언과 동시에 초기화)
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		// 특정 인덱스 하나만 출력
		System.out.println(arr[1][1]);
		
		// 전체 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 전체 출력: arr2
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
