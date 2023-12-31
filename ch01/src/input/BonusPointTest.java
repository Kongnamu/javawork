package input;

import java.util.Scanner;

public class BonusPointTest {

	public static void main(String[] args) {
		// 고객의 이름, 구매 금액을 입력
		// 이름과 구매포인트 출력
		// 구매포인트(bonusPoint) = 상품가격(price) * 포인트적립율(bonusRatio)
		// 입력 ↓
		Scanner sc = new Scanner(System.in);
		System.out.print("고객의 이름을 입력하세요: ");
		String customer = sc.nextLine(); // 사용자가 이름을 입력할 수 있게 설정
		
		System.out.print("구매 금액을 입력하시오: ");
		int price = sc.nextInt(); // 사용자가 금액을 입력할 수 있게 설정
		double bonusRatio = 0.02;
		int bonusPoint = 0;
		
		// 계산 ↓
		bonusPoint = (int)(price * bonusRatio); // 실수형을 정수형으로 강제 형 변환 (int 사용)
		
		// 출력 ↓
		System.out.println(customer + "님의 보너스 포인트는 " + bonusPoint + "점 입니다.");
		
		sc.close();
	}

}
