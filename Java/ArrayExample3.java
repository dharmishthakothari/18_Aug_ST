package basic;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//user enters 5 values in array
		
		Scanner scan=new Scanner(System.in);
		int []num=new int[5];
		for(int i=0;i<num.length;i++)
		{
			System.out.print("Enter element ");
			
			num[i]=scan.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
	}

}
