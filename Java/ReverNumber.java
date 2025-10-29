package basic;

import java.util.Scanner;

public class ReverNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter number ");
			int num=scan.nextInt();
//			int rem=num%10;
//			System.out.println(rem);
			int rem,count=0;
			while(num!=0)
			{
				rem=num%10;
				System.out.print(rem);
				num=num/10;
				count++;
			}
			System.out.println("The no of Digits "+count);
			
	}

}
