package basic;

import java.util.Scanner;

public class RelationalOpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variable declaration 
		int number1,number2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		number1=scan.nextInt();
		System.out.println("Enter another number ");
		number2=scan.nextInt();
		//boolean ans=number1>number2;
		System.out.println("number1>number2 "+(number1>number2));
		System.out.println("number1<number2 "+(number1<number2));
		System.out.println("number1<=number2 " +(number1<=number2));
		System.out.println("number1>=number2 "+(number1>=number2));
		//number1>number2 false
		//20>20 false	
		
		System.out.println(number1+">"+number2+(number1>number2));
		System.out.println(number1 +"<"+number2+(number1<number2));
		System.out.println(number1+"<="+number2+(number1<=number2));
		System.out.println(number1 +">="+number2 +(number1>=number2));
		System.out.println(number1 +"=="+number2 +(number1==number2));
		System.out.println(number1 +"!="+number2 +(number1!=number2));
						
	
	}

}
