package basic;

import java.io.FileOutputStream;

public class FileWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String FILEPATH = "C:\\Users\\Admin\\Downloads\\NewFile.txt";
		FileOutputStream fos=new FileOutputStream(FILEPATH);
		String s="Good Morning";
		byte b[]=s.getBytes();
		fos.write(b);
		
		System.out.println("File written Successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
