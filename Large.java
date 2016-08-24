package id;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
int a,b,c;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if((a>b)&&(a>c))
		{
	System.out.println("A is Larger");
		}
else if((b>a)&&(b>c))
{
	System.out.println("B is Larger");
}
else
{
	System.out.println("C is Larger");
}
	}

}
