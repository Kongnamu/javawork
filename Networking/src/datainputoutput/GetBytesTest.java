package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GetBytesTest {

	public static void main(String[] args) {
		//OutputStream은 문자열 쓰기를 지원하지 않지만
		//String 클래스의 getBytes()를 지원하고 있다.
		//바이트 기반으로 데이터 보내기
		try {
			OutputStream os = new FileOutputStream("c:/File/out.txt");
			String data = "안녕하세요.\n좋은 아침입니다.\nI'm sturbing";
			
			os.write(data.getBytes());
			
			os.flush(); // 잔류 버퍼를 지워준다
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
