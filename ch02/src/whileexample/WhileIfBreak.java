package whileexample;

public class WhileIfBreak {

	public static void main(String[] args) {
		// 반복 조건문 (while ~ if ~ break)
		// 1부터 10까지 출력
		
		int i = 0;
		
		while(true) { // 반복 조건
             i++;
             System.out.print(i);
             if(i == 10) //중괄호 블럭은 실행문이 한줄일때 생략 가능
            	 break; //탈출
             }
         }
	}
