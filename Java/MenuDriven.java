package basic;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while (true) {
		
		
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Mulplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Please enter your choice :");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("Please enter 2 numbers ");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				System.out.println("Addition of 2 numbers is " + (num1 + num2));
			} else if (choice == 2) {
				System.out.println("Please enter 2 numbers ");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				System.out.println("Substraction of 2 numbers is " + (num1 - num2));
			} 
			else if(choice==3)
			{
				System.out.println("Please enter 2 numbers ");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				System.out.println("Multiplication  of 2 numbers is "+(num1*num2));
			}else if(choice==4)
			{
				System.out.println("Please enter 2 numbers ");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				System.out.println("Division of 2 numbers is "+(num1/num2));
			}
			else if (choice == 5) {
				System.out.println("OK Bye ");
				break;
			}
			else
			{
				System.out.println("Please enter valid choice ");
			}
		}

	}

}
