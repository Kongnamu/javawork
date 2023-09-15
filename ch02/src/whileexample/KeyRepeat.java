package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'키 입력시 "계속 반복합니다."
		// 'n'키 입력시 "반복을 중단합니다."
		// 그 외의 키 입력시 "키를 잘못눌렀습니다."
		// 문자열 동등 비교함수는 equals()
		//String key = "y"; //한문자지만 ""를 붙혀야함
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n) : ");
			String key = sc.nextLine();
			
		//문자가 일치하는지 비교할때 equals 씀
        if(key.equals("y") || key.equals("Y")) {
            System.out.print("계속 반복합니다.");
		}else if(key.equals("n") || key.equals("N")) {
		    System.out.println("반복을 중단합니다.");	
		    break; // 종료값
		}else {
			    System.out.println("키를 잘못 눌렀습니다.");
		}
     }
		sc.close();

   }

}
