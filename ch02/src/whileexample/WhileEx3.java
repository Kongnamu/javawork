package whileexample;

public class WhileEx3 {

	public static void main(String[] args) {
		// 1~10까지 출력
		// 반복 조건문(while ~ if ~ break) 사용
		// 변수: i (반복할 수 있는 변수)
		int i = 0;
		
		while(true) {
			i++;
			if(i > 10)
				break;
			System.out.println(i);
		}

	}

}
