package fact;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		  int fact = 1;  
	        int i = 1;  
	   
	          
	        //counting the factorial using while loop  
	        while( i <= num ){  
	            fact = fact * i;   
	            i++; //increment i by 1   
	        }     
	  
	        //printing the result  
	        System.out.println("\nFactorial of " + num + " is: " + fact);  
	}
}
