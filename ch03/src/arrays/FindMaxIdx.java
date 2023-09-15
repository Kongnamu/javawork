package arrays;

public class FindMaxIdx {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		// 최대값의 위치를 0번으로 설정
		int[] arr = new int[] {10, 50, 80, 30, 20};
		int maxIdx = 0;
		
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] > arr[maxIdx]) // arr 값의 대소를 비교
				maxIdx = i; // 최대값 위치에 i를 저장 (i가 위치 표기하는 값이니까)
		}

		//최대값의 위치 출력
				System.out.println("최대값의 위치: " + maxIdx);
		
	}

}
