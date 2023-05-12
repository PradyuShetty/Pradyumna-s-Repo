package Customer;
import java.util.Scanner;
public class Customer1 {
	public static void main(String args[])
	{
		//int quantity=0 , price=0 , discount=0 , amount=0 ;

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the bill");
		double amount=Sc.nextDouble();
		System.out.println("Enter the age");
		int age=Sc.nextInt();
		
		if(age > 50)
		{
			amount = amount - ((5d/100)*amount);
		}
		
		System.out.println("The Total Amount is:"+amount);
		
	}
	
}
