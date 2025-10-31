package basic;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		//row
		for(int i=1;i<=num;i++)
		{
			//column
			for(int j=0;j<i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
