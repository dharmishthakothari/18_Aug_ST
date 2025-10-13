package basic;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month ");
		int month_no = scan.nextInt();
		switch (month_no) {
		case 1:
			System.out.println(" January 31 days");
			break;
		case 2:
			System.out.println("February 28/29 days");
			break;
		case 3:
			System.out.println("March 31 days");
			break;
		case 4:
			System.out.println("April 31 days");
			break;
		case 5:
			System.out.println("May - 30 days");
			break;
		case 6:
			System.out.println("june 31 days");
			break;
		case 7:
			System.out.println("july 30 days");
			break;
		case 8:
			System.out.println("August 30 days");
			break;
		case 9:
			System.out.println("31 days");
			break;
		case 10:
			System.out.println("31 days");
			break;
		case 11:
			System.out.println("30 days");
			break;
		case 12:
			System.out.println("31 days");
			break;
		default :
				System.out.println("Month number is not valid");

		}
	}

}
