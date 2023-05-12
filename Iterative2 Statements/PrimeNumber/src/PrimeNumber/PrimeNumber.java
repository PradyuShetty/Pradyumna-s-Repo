package PrimeNumber;
import java.util.Scanner;
public class PrimeNumber {
			public static void main(String args[])
			{
				int n=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number");
				int i=sc.nextInt();
				for(i=2;i<n-1;i++)
				{
					if(n%i==0)
					{
						System.out.println("Its not a prime number");
						break;
					}
				}
				if(i==n)
				{
					System.out.println("Its a prime number");
				}
			}
}
