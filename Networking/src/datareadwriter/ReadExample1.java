package datareadwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) {
		
		try(Reader reader = new FileReader("c:/File/test.txt")) {
			while(true) {
				int data = reader.read();
				//System.out.println(data);
				if(data == -1) break;
				System.out.print((char)data + " ");
			}
			//reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
