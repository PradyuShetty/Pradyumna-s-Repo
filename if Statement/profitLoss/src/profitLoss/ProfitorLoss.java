package profitLoss;
import java.util.Scanner;
public class ProfitorLoss {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost price");
		int cp=sc.nextInt();
		System.out.println("enter thwe selling price");
		int sp=sc.nextInt();
		if(cp>sp)
		{
			System.out.println("Occured a loss");
		}
		else
		{
			System.out.println("profit");
		}
	}
}
