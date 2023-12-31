package dates;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		//지나온 시간 측정
		// 1970. 1. 1 자정 이후부터 측정 - 밀리초로 계산됨
		// 유닉스 컴퓨터 개시된 시간부터로 측정됨
		// 1/1억(n:나노초) > 1/백만(ms:마이크로초) > 1/1000ms(밀리세컨드) > 1초(s)
		//System.out.println(24*60*60*1000);
		long passedTime = cal.getTimeInMillis();
		System.out.println(passedTime);
		
		//밀리초를 일로 환산
		passedTime = passedTime/(24*60*60*1000);
		System.out.println(passedTime);
		
		//시작일, 종료일 설정
		Calendar startDay = Calendar.getInstance();
		Calendar toDay = Calendar.getInstance();
		
		startDay.set(2023, 9, 1); // 시작일 설정
		toDay.set(2023, 9, 15);   // 종료일 설정
		
		//초로 환산
		long betweenTime = toDay.getTimeInMillis() - 
				startDay.getTimeInMillis();
		
		//일로 환산
		betweenTime = betweenTime/(24*60*60*1000);
		System.out.println(betweenTime + "일 지났습니다.");
		
		//현재까지의 시간(밀리초)
		System.out.println(System.currentTimeMillis());
		
		//현재까지의 시간(나노초)
		System.out.println(System.nanoTime());

	}

}
