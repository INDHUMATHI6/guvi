package id;

import java.util.Scanner;

public class psn {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	if(n>0)
	{
		System.out.println("The number is positive");
	}
	else if(n<0)
	{
		System.out.println("The number is negative");
	}
	else
	{
		System.out.println("The number is zero");
	}
}
}

	