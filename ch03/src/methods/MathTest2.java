package methods;

public class MathTest2 {

	public static void main(String[] args) {
		// 주사위 10번 던지기
		
		for(int i=1; i<=10; i++) {
			int dice = (int)(Math.random()*6) + 1;
					System.out.println(dice);
		}
		
		// 배열에서 문자열 랜덤 출력
		String[] word = {"나", "너", "우리"};
		int idx = (int)(Math.random()*word.length);
		// System.out.println(idx);
		System.out.println(word[idx]);
		
		// 특정 단어 추출
		System.out.println(word[0]);
		
		// 전체 추출
		for(int i=0; i < word.length; i++ ) {
			System.out.println(word[i]);
		}
		

	}

}
