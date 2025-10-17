package basic_java;

import java.util.Scanner;

public class WhileExample_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter start number ");
		int i=scan.nextInt();
		System.out.println("Enter end  number ");
		int j=scan.nextInt();
		while(i<=j)
		{
			System.out.println(i);
			i++;
		}
		
	}

}
