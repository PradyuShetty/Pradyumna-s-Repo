package prime;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(i=2; i<=n-1; i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is not prime");
				break;
			}
			
			
		}
		if(i==n)
			{
				System.out.println("Number is prime");
			}
	}
}
