package basic_java;

import java.util.Scanner;

public class MultilicationTable_doWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		int i=1,mul;
		do
		{
			mul=i*num;
			System.out.println(mul);
			i++;
		}while(i<=10);

	}

}
