package EvenOdd;
import java.util.Scanner;
public class EvenOddNumber {
	public static void main(String args[])
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=Sc.nextInt();
		if(num%2==1)
		{
			System.out.println("Odd Number");
		}
		else 
		{
			System.out.println("Even number");
		}
	}
}
