package forexample;

public class GugudanTest {

	public static void main(String[] args) {
		// 단일 for문
		/* 
		  3x1=3
		  3x2=6
		  3x3=9
		  ...
		  3x8=24
		  3x9=27
		 */
		int dan = 9;
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i + "=" + dan * i);
		}

	}

}
