import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int loan, interest, years;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the loan amount ");
		loan = sc.nextInt();
		System.out.print("Enter the annual interest rate (in %) ");
		interest = sc.nextInt();
		System.out.print("Enter the number of years ");
		years = sc.nextInt();
		double yearInterest = loan*interest/100;
		double month = yearInterest/12.0;
		double total = yearInterest*years;
		System.out.println("The monthly payment is $"+month);
		System.out.println("The total payment is $"+total);
	}
}
