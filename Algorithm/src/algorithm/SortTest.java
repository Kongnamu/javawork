package algorithm;

public class SortTest {

	public static void main(String[] args) {
		// 오름차순 정렬 : 버블(거품) 정렬
		// 자리 바꾸기(위치) a, b, temp
		// 정렬시: 2,3,4,5,6,9
		int[] arr = {3, 6, 9, 2, 5, 4};
		int temp; // 임시 변수: i와 j를 temp라는 저장공간을 통해 옮겨서 자리를 바꾼후 오름차순 정렬하기 위함
		
		// 중첩 for
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) { //자리 바꿈
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		}
	}
		/*
		  1행 - 3 6 2 5 4 9 
		  2행 - 3 2 5 4 6 9
		  3행 - 2 3 4 5 6 9
		  ....
		 */
	
	    // arr 출력
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.print(arr[i] + " ");
	     }
	}

}
