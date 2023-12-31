package calctime;

public class SystemTime {

	public static void main(String[] args) {
		//성능 테스트 : 소요 시간 측정 - ms, ns
		//현재까지의 시간: ms(밀리초)
		//long start = System.currentTimeMillis(); //밀리초 계산 시작시간
		long start = System.nanoTime();
		long sum = 0;
		for(int i = 1; i < 1000000; i++) {
			sum += i;
		}
		
		//long end = System.currentTimeMillis(); // 밀리초 계산 끝나는시간
		long end = System.nanoTime();
		System.out.println(sum); // 합계
		//System.out.println(end-start + "ms"); //합계 구하는데 걸린 시간(밀리초)
		System.out.println((end-start)/1000000 + "ns");   //합계 구하는데 걸린 시간(나노초)
	}

}
