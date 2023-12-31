package typinggame;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 영어 단어가 랜덤하게 화면에 출제되면 타이핑을 한다!
		// 오타가 없으면 "통과", "있으면 다시 도전"
		// 10문제 수행 
		//시간 측정
		
		//배열 
		String[] words = {"ant", "bear", "chicken", "cat", "dog", 
				"elephant", "frog", "horse", "monkey", "tiger"};
		
		Scanner sc = new Scanner(System.in);
		int n =1; // 문제 번호
		double start, end;
		System.out.println("영어타자 게임! 준비되면 Enter");
		sc.nextLine(); // Enter
		start = System.currentTimeMillis(); // 게임 시작전 시간
		
		
		while(n < 11) {
		//랜덤 배열
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제" + n); // 문제1 로 출력됨
			String question = words[rand];
			System.out.println(words[rand]); // 단어 출제
			
			//단어 입력
			String answer = sc.nextLine(); // 사용자 입력
			
			if(question.equals(answer)) {
				System.out.println("통과");
				n++; // 통과시 다음문제 나옴
			}else {
				System.out.println("오타! 다시 도전!");
			}
		}
		end = System.currentTimeMillis();
		System.out.printf("게임 소요 시간: %.2f초입니다.\n",(end-start)/1000);
		
		sc.close();

	}

}
