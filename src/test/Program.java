package test;

import java.util.Vector;

public class Program {
	
	private int current_value = 0;
	private int[] nums = new int[5];
	
	boolean CheckValue(int number)
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
	
	public void InsertValue(int value)
	{
		nums[current_value] = value;
		current_value++;
	}
	
	public int[] ShowList()
	{
		return nums;
	}
	
}
