package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		//Map 자료구조의 객체 생성
		Map<String, Integer> map = new HashMap<>();
		int idx = 0;
		
		
		//자료 저장
		map.put("Java", ++idx);
		map.put("Python", ++idx);
		map.put("C", ++idx);
		map.put("Python", ++idx);
		map.put("Javascript", ++idx);
		
		//key 가져오기
		Set<String> keys = map.keySet();
		
		//자료의 크기
		System.out.println("총 객체 수: " + map.size());
		System.out.println("총 엔트리(keys) 수: " + keys.size());
		
		//key 조회
		for(String key : keys) //출력 순서는 랜덤이나 중복 불가
			System.out.println(key + " : " + map.get(key));
		
		System.out.println("===============================");
		
		//람다식 조회
		keys.forEach(key -> System.out.println(key));
		
		System.out.println("===============================");
		
		//자료 존재 유무
		System.out.println(map.containsKey("C++"));
		
		//자료 삭제
		if(map.containsKey("Python")) {
			map.remove("Python");
			
		//람다식 조회
			keys.forEach(key -> System.out.println(key + " : " + map.get(key)));
		}
		
	}

}
