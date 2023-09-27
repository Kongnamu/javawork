package BufferedStream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteWordTest {

	public static void main(String[] args) {

		try (Writer writer = new FileWriter("word.txt")) {
			//Writer writer = new FileWriter("c:/File/word.txt");
			
			//입력
			String msg = "ant, bear, chicken, cow, eagle, "
					+ "elephant, horse, monkey, penguin, tiger";
			writer.write(msg);
			writer.flush();
			//writer.close();
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
