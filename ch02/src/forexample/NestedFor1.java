package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 중첩 for문
		// 5행 5열에 '*' 출력
		for(int i=1; i<=5; i++) {     // 행
			for(int j=1; j<=5; j++) { // 열
			System.out.print('*');
		   }
			System.out.println(); // 한줄 띄움
		}
		
       /*
         i=1 j=1 *
             j=2 **
             j=3 ***
             j=4 ****
             j=5 *****
         i=2 j=1 *  
             j=2 **
             j=3 *** 
             j=4 ****
             j=5 *****
        */
		
		// 삼각형 모양1: 행의 변화는 없고 행 증가시 열이 하나씩 증가함
		for(int i=1; i<=5; i++) {     // 행
			for(int j=1; j<=i; j++) { // 열
			System.out.print('*');
		   }
			System.out.println(); // 한줄 띄움
		}
		
		// 삼각형 모양2: 행의 변화는 없고 행 증가시 열이 하나씩 감소
		for(int i=1; i<=5; i++) {     // 행
			for(int j=1; j<=6-i; j++) { // 열
			System.out.print('*');
		   }
			System.out.println(); // 한줄 띄움
		}
		
		// -- 사용시
		for(int i=1; i<=5; i++) {     // 행
			for(int j=5; j>=i; j--) { // 열
			System.out.print('*');
			// System.out.println("i=" + i + ", j=" + j); <- 어떻게 처리되는지 확인할 수 있다
		   }
			System.out.println(); // 한줄 띄움
		}
		
	}

}
