package test;

public class Program {
	static boolean Insert(int number)
	{
		boolean pass = false;
		
		if(number >= 20)
		{
			pass = true;
		}
		else
		{
			pass = false;
		}
		
		return pass;
	}
}
