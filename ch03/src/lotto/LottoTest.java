package lotto;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1~45중 6개 추출
		// 배열의 크기 6개인 lotto번호 생성 선언
		int[] lotto = new int[6];
		
		
		// 번호 1개 추출
		lotto[0] = (int)(Math.random()*45) + 1;
				System.out.println(lotto[0]);
				
		// 번호 6개 생성
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
		}
        
		// 번호 6개 추출
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
			
		// 중복 번호 문제 해결: 중첩 for
		for(int j = 0; j < i; j++) {
			if(lotto[i] == lotto[j])
				i--; // 이전 인덱스로 이동
		}
		/* 번호가 아래와 같이 나올 시
		 * 7 9 3 9 20 15
		 i=0      7
		 i=1 j=0  9
		 i=2 j=1  3
		 i=3 j=2  9 -> 중복 (재 추첨)
		 i=4 j=3  
		 */
		
	  }	
		//파일 이름 출력
		LottoTest lottoTest = new LottoTest();
	    System.out.println(lottoTest);
   }

}
