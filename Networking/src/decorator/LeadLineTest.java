package decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LeadLineTest {

	public static void main(String[] args) {
		
		try {
			//기반스트림
			Reader reader = new FileReader("message.txt");
			//보조스트림에 기반한 스트림 연결
			BufferedReader br = new BufferedReader(reader);
			
			//String data = br.readLine(); //1행 읽기
			//System.out.println(data);
			
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
