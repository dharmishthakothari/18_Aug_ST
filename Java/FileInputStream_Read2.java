package basic;

import java.io.FileInputStream;

public class FileInputStream_Read2 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				FileInputStream fis = new FileInputStream("../CoreJava/src/basic/EncapsulationExample2.java");
				byte[] b=new byte[50];
				int i=fis.read(b,5,25);
				String s=new String(b);
				System.out.print(s);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
