package dates;

import java.util.Calendar;

public class CalendarTeal {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		
		//년도 출력
		int year = cal.get(Calendar.YEAR);
		System.out.println(year + "년");
		System.out.println(cal.get(Calendar.YEAR));

		
		//월 출력 (배열 기준으로 출력됨 0이 1월이므로 1을 더해줌)
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month + "월");
		
		//일 출력
		int date = cal.get(Calendar.DATE);
		System.out.println(date + "일");
		
		//요일 출력 - 1:일요일, 2:월요일 --- 6:금요일, 7:토요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일", 
				"금요일", "토요일"};
		System.out.println(days[0]);
		System.out.println(days[day-1]);
		
		//시간
		System.out.println(cal.get(Calendar.HOUR) + "시");
		
		//분
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		
		//초
		System.out.println(cal.get(Calendar.SECOND) + "초");
	}

}
