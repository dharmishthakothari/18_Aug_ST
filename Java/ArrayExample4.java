package basic;

import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of elements you want ");
		int total_num=scan.nextInt();
		
		int []num=new int[total_num];
		for(int i=0;i<num.length;i++)
		{
			System.out.print("Enter "+i+" element ");
			
			num[i]=scan.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}

}
