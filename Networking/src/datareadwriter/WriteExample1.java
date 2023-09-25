package datareadwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("c:/File/test.txt");
			
			//1. 한 문자쓰기
			char a = 'A';
			char b = 'B';
			
			//2. 문자열 쓰기
			String str = "안녕하세요";
			
			//3. 배열 쓰기
			char[] arr = {'C', 'D', 'E'};
			
			writer.write(a);
			writer.write(b);
			writer.write(arr);
			writer.write(str);
			
			writer.flush();
			writer.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
