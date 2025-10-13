package basic;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,weight;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age ");
		age=scan.nextInt();
		
		System.out.println("Enter Weight");
		weight=scan.nextInt();
		
		if(age>=18)
		{
			if(weight>=45)
			{
				System.out.println("You are eligilbe to donate blood");
			}else
			{
				System.out.println("You are underweight");
			}
		}else
		{
			System.out.println("Yor are minor,not eligible to donate blood");
		}
		

	}

}
