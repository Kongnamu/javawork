package decorator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		//파일에 문자열 쓰기 : Writer - fileWriter
		try (Writer writer = new FileWriter("message.txt")) {
			
			//문자열 쓰기
			String msg = "오늘도 좋은 하루!\n배고파\n밥주세여\n감사합니다.";
			writer.write(msg);
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
