package id;

import java.util.Scanner;

public class Nature {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the natural number");
	int n=s.nextInt();
	int sum=0;
	for(int i=0;i<n;i++)
	{
	sum+=i;
		
	
	}
	System.out.println("The sum is"+sum);
	}
}
