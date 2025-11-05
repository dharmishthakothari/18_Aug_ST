package basic;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter no of elements you want ");
		int n=scan.nextInt();
		int[] numbers=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element ");
			numbers[i]=scan.nextInt();
		}
		int sum=0;
		//printing the elements 
		for(int i=0;i<n;i++)
		{
			//System.out.println(numbers[i]);
			sum=sum+numbers[i];
		}
		
		System.out.println("Sum of elements "+sum);
		
		
		
	}

}
