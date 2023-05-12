package NumPattern2;

public class NumberPattern2 {
	public static void main(String args[])
	{
		int num1 = 0, num2 = 0, num3 = 0;
		for(int i = 1; i <= 3; i++)
		{
			switch(i)
			{
				case 1: num1 = 19; num2 = 0; num3 =0; break;
				case 2: num1 = 0; num2 = 19; num3 = 0; break;
				case 3: num1 = 0; num2 = 0; num3 = 19; break;
			}	
			System.out.println(num1 + " " + num2 + " " + num3);
		}
	}
}
