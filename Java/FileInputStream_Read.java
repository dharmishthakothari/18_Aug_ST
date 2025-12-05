package basic;

import java.io.FileInputStream;

public class FileInputStream_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("../CoreJava/src/basic/EncapsulationExample2.java");
			
			//reading single char/ascii value
			//fis.read()
			int i=0;
			while(i!=-1)
			{
				byte[] b=new byte[10];
				i=fis.read(b);
				String s=new String(b);
				System.out.print(s);
			}
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
