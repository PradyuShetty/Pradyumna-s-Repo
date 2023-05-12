package FierstNumber;
import java.util.Scanner;

public class IncreamentFirstNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m");
		int m = sc.nextInt();
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int answer = 1;
		int n_copy = n;
		while(n_copy > 0)
		{
			answer = answer * m;
			n_copy--;
		}
		System.out.println(m+"^"+n+" = "+answer);
	}
}
