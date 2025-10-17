package basic_java;

import java.util.Scanner;

public class WhileExample_check_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter start number ");
		int i=scan.nextInt();
		System.out.println("Enter end  number ");
		int j=scan.nextInt();
		while(i<=j)
		{
			if(i%2==0)
				System.out.println(i+" Even ");
			else
				System.out.println(i+" Odd ");
			i++;
		}
		
	}

}
