package id;

import java.util.Scanner;

public class Alp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println("The value is alphabet");
		}
		else
		{
			System.out.println("The value is not a alphabet");
		}

	}

}
