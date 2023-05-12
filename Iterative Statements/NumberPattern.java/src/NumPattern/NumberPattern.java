package NumPattern;

public class NumberPattern {
	public static void main(String args[])
	{
		String prev = new String();
		String later = new String();
		String s = new String();
		for(int i = 1; i <= 5; i++)
		{
			if(i > 2)
			{
				s = " " + prev + i + later;
			}
			else
			{
				s = prev + i + later;
			}
			
			System.out.println(s);
			prev = prev + i;
			later = i + later;
		}
	}
}
