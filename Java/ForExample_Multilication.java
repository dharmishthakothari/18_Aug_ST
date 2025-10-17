package basic_java;

import java.util.Scanner;

public class ForExample_Multilication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		int mul;
		for(int i=1;i<=10;i++)
		{
			mul=i*num;
			System.out.println(mul);
		}
	}

}
