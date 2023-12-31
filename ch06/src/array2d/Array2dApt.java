package array2d;

public class Array2dApt {

	public static void main(String[] args) {
		// 아파트 세대 구현하기
		// 전체 5층에 한 층당 3세대
		// 3층만 1세대
		int[][] household = new int[5][3];
		household[2] = new int[1]; // 1차원 배열: 3층(2번인덱스)은 1세대이다.
		
		System.out.printf("5층 %d세대\n", household[4].length);
		System.out.printf("4층 %d세대\n", household[3].length);
		System.out.printf("3층 %d세대\n", household[2].length);
		System.out.printf("2층 %d세대\n", household[1].length);
		System.out.printf("1층 %d세대\n", household[0].length);
		

	}

}
