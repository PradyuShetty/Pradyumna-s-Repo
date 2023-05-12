package UCLC;
import java.util.Scanner;
public class UppercaseLowercaseDigit {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//input from the user
		System.out.print("Enter a character : ");
		char c = sc.next().charAt(0);
		int n = c;
		//condition for upper case
		if(c >=65 && c <=90)
			System.out.println("Uppercase");
		//condition for lower case
		else if(c >= 97 && c <=122 )
			System.out.println("Lowercase");
		//condition for digit
		else if(c >=48 && c <= 57)
			System.out.println("Digit");
		//condition for special characters
		else
			System.out.println("Special Character");
		System.out.println("ASCII value : "+n);
		//closing scanner class(not compulsory, but good practice)
		sc.close();
	}
}
