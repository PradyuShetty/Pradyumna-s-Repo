package Deno;
import java.util.Scanner;
public class Denomination {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1=sc.nextInt();
		String s = new String();
		/*char c;
		
		String s=Integer.toString(num1);
		c = s.charAt(0);
		System.out.println(s.charAt(0)+("*1000")+ " = " 
		+ (Integer.parseInt(c) * 1000));

		System.out.println(s.charAt(1)+("*100"));

		System.out.println(s.charAt(2)+("*10"));
	
		System.out.println(s.charAt(3)+("*1"));
		*/
		int power = 1;
		while(num1 != 0)
		{
			s = (num1 % 10) + "*" + power + "=" + ((num1 % 10) * power)+"\n" + s;
			power = power * 10;
			num1 = num1 / 10;
		}
		System.out.print(s);
	}
}
