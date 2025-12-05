package basic;

import java.io.FileReader;

public class FileReadExample1 {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			FileReader reader = new FileReader("../CoreJava/src/basic/EncapsulationExample2.java");
			
			//Method1
//			int i=0;
//			while (i != -1) {
//				i = reader.read();
//				System.out.print((char) i);
//			}
			
			
			//Method 2
//			char[] data=new char[200];
//			reader.read(data);
//			String s=new String(data);
//			System.out.println(s);
			
			
			//method 3
			char[] data=new char[200];
			reader.read(data,5,20);
			String s=new String(data);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
