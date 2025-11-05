package basic;

import java.util.Scanner;

public class ArrayExample6 {

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
		
		for(int i=0;i<n;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.println(numbers[i]+" even ");
			}
			else
				System.out.println(numbers[i]+" odd");
		}
				
	}

}
