package fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos1 = new FileOutputStream("D:\\Testtxt\\test.txt");
		fos1.write('3');
		fos1.close();
	}
}
