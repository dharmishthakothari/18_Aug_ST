package basic;

import java.util.Scanner;

public class if_stmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check number is greater then 100 or not
		
		// First format 
//		
//		int num=80;
//		if(num<100) // relational
//		{
//			System.out.println("in if block ");
//			System.out.println("no is greater then 100");
//		}
	
		//Second Format
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter number ");
//		
//		int num=scan.nextInt();
//		//check number is Positive/Negative
//		if(num>0)
//		{
//			System.out.println(num+" is Positive");
//		}
//		else
//		{
//			System.out.println(num+" is Nagetive ");
//		}
	
		//Third Formate
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		if(num>0)
		{
			System.out.println("Number is Positive ");
		}else if(num<0)
		{
			System.out.println("Number is Negative ");
		}else
		{
			System.out.println("number is Zero ");
		}
		
		
		//scanner class util package
		//scanner object System.in
//		integer -- nextInt
//		float --- nextFloat
//		string --- next()
//		scan.nex
	}

}
