package Bigger;

import java.util.Scanner;

public class BiggerNumber {
	public static void main(String args[])
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter num1");
		int n1=Sc.nextInt();
		System.out.println("Enter num2");
		int n2=Sc.nextInt();
		if(n1>n2)
		{
			System.out.println("num1 is greater");
		}
		else
		{
			System.out.println("num2 is greater");
		}
	}
}
