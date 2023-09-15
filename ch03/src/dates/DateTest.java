package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// Date 객체 생성
		Date date = new Date();
		System.out.println(date);
		
		// 날짜, 시간 포맷: "yyyy/MM/dd hh:mm:ss a" -> MM의 경우 소문자로 하면 '분'이 표기되어 대문자로 입력
		SimpleDateFormat now = 
				new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
		System.out.println(now.format(date));

	}

}
