package Synchronizedmap; //동기회된 컬렉션

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		//동기회된 컬렉션: 멀티 스레드
		//Map<Integer, String> map = 
		//		Collections.synchronizedMap(new HashMap<>());
		Map<Integer, String> map = new HashMap<>(); // 싱글 스레드
		
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i = 1001; i <= 2000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		threadA.start(); //메인 스레드가 호출하고 일시정지 상태로 돌아감
		threadB.start();
		
		try {
			threadA.join(); //run()을 실행
			threadB.join();			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("총 객채수: " + map.size());
		
		//map에 저장된 자료 전체 출력
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
			System.out.println(key + ", " + map.get(key));
	}

}
