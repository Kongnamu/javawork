package interfaceex.sorting; //교재 346p 문제풀이

public interface Sort {
	
	public void ascending(int[] array);
	
	public void descending(int[] array);
	
	default public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}

}
