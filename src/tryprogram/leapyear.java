package tryprogram;

import java.util.Scanner;

public class leapyear {
public static void main(String[] args) {
	System.out.println("year:");
	int year;
	Scanner sc=new Scanner(System.in);
	year=sc.nextInt();
	//int year=1996;
	if (year%4==0 && year%100!=0||year%400==0) {
		System.out.println("yes it a leap year");
	}
	else{
		System.out.println("no");
	}
}
}
