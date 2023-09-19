package interfaceex.sorting; //교재 346p 문제풀이

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] array) {
		System.out.println("HeapSort ascending");		
	}

	@Override
	public void descending(int[] array) {
		System.out.println("HeapSort descending");		
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}

}
