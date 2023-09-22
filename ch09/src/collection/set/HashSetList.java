package collection.set; //HashSet 사용

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetList {

	public static void main(String[] args) {
		//Set 인터페이스를 구현한 HashSet 클래스의 객체 생성
		//순서가 없고, 중복 데이터를 허용하지 않음
		Set<String> set = new HashSet<>();
		
		//객체 생성
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		
		//특정 객체 조회 (읽기)
		if(set.contains("java")) {
			System.out.println("java");
		}
		//객체의 수
		System.out.println("총 객체수: " + set.size());
		
		//객체 삭제
		if(set.contains("jsp"))
			set.remove("jsp");
		
		//전체 목록 조회
		//순서가 없어서 인덱싱을 할 수 없음 -> 클래스 Iterator 사용
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {              //객체 수만큼 반복
			String element = iterator.next();    //다음 객체가 있으면 가져옴
			System.out.println(element);         //출력
		}
		
		System.out.println("==============================");
		
		//전체 조회2 (향상 for문)
		for(String element : set)
			System.out.println(element);
		
		System.out.println(set);
	}

}
