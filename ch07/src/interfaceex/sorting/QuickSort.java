package interfaceex.sorting;//교재 346p 문제풀이

public class QuickSort implements Sort {

			
	@Override
	public void ascending(int[] array) {
		System.out.println("QuickSort ascending");		
	}

	@Override
	public void descending(int[] array) {
		System.out.println("QuickSort descending");		
		
	}

	@Override
	public void description() {		
		Sort.super.description();
		System.out.println("QuickSort입니다.");		
		
	}

}
