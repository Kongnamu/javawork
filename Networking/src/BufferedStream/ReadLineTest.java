package BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadLineTest {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))) {
			String[] word = null;
			
				while(true) {
					String data = br.readLine();
					if(data == null) break;
					//System.out.println(data);
					word = data.split(" ");
				}
				System.out.println(Arrays.toString(word));
				
			//랜덤 출력
			//int dice = (int)(Math.random()*6 + 1);
			//System.out.println(dice);
			//System.out.println(word.length);
			int rrd = (int)(Math.random()*word.length);
			System.out.println(rrd);
			System.out.println(word[rrd]);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
			
	}

}
