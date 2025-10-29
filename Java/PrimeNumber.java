package basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		int temp=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				//System.out.println("Number is not prime");
				temp=0;
				break;
			}else
			{
				temp=1;
				//System.out.println("Number is prime");
			}				
		}
		if(temp==1)
		{
			System.out.println("Number is prime");
		}else
		{
			System.out.println("Number is not prime");
		}
	}
}
