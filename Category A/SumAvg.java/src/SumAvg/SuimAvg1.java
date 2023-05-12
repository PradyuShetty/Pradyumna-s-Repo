package SumAvg;
import java.util.Scanner;
public class SuimAvg1 {
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int p=Sc.nextInt();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num2");
		int b=sc.nextInt();
		int s;
		int a;
		s=p+b;
		a=s/2;
		System.out.println("Sum is " +s);
		System.out.println("avg is " +a);
	}
}
