package SwapNo;
import java.util.Scanner;
public class Swap {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1");
		int p=sc.nextInt();
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter num2");
		int b=sc.nextInt();
		int temp=0;
		temp=p;
		p=b;
		b=temp;
		
		System.out.println("num1 is "+p);
		System.out.println("num2 is "+b);
	}
}
