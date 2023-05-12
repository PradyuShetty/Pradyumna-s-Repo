package PersonsWeight;
import java.util.Scanner;
public class weight {
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter first persons weight");
		int p=Sc.nextInt();
		
		System.out.println("Enter second persons weight");
		int b=Sc.nextInt();

		System.out.println("Enter third persons weight");
		int d=Sc.nextInt();
	
		System.out.println("Enter forth persons weight");
		int e=Sc.nextInt();
	
		System.out.println("Enter fifth persons weight");
		int g=Sc.nextInt();
		int avg=0;
		int net=0;
		net=p+b+d+e+g;
		avg= (p+b+d+e+g)/5;
		System.out.println("the net weight of the person is "+net);

		System.out.println("the average weight of the person is "+avg);

	}
}
