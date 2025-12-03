package basic;

import java.io.FileInputStream;

public class FileReading_Byte {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		try {
			//String FILEPATH = "C:\\Users\\Admin\\Downloads\\SQL_Query.txt";
			String FILEPATH = "../CoreJava/src/basic/EncapsulationExample2.java";

			FileInputStream fis = new FileInputStream(FILEPATH);
			int i;
			do {
				i=fis.read();
				System.out.print((char)i);
			}while(i!=-1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
