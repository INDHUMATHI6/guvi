package id;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long l=s.nextLong();
		if((l%4)==0)
		{
			System.out.println("It is leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}

	}

}
