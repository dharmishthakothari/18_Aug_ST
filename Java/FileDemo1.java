package basic;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String FILEPATH = "C:\\Users\\Admin\\Downloads\\SQL_Query.txt";
		//String FILEPATH = "../CoreJava/src/basic/EncapsulationExample2.java";
		String FILEPATH = "../CoreJava/src/basic";
		File file=new File(FILEPATH);
		
		System.out.println(file.exists());
		System.out.println(file.canRead());
		//file.isDirectory()
		String[] lst=file.list();
		System.out.println(lst.length);
//		for(int i=0;i<lst.length;i++)
//		{
//			System.out.println(lst[i]);
//		}
		//for each 
		for(String s:lst)
		{
			File f=new File(FILEPATH+"/"+s);
			System.out.println(s+"\t"+f.canRead());
		}
		
	}

}
