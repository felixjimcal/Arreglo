package test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class TestProgram {
	
	Program pro;
	
	public TestProgram() {
		pro = new Program();
	}

	@Test
	public void Give20OrBigger() 
	{
		int value = 22;
		boolean expected = true;
		
		assertEquals(expected, pro.isBiggerOrEqualThan20(20));
		assertEquals(expected, pro.isBiggerOrEqualThan20(value));
	}
	
	@Test
	public void GiveLowerThan20() 
	{
		int value = 19;
		boolean expected = false;
		
		assertEquals(expected, pro.isBiggerOrEqualThan20(value));
	}
	
	@Test
	public void ListIsFull() 
	{
		int nums[] = {26, 62, 73, 37, 45};
		
		pro.InsertValue(26);
		pro.InsertValue(62);
		pro.InsertValue(73);
		pro.InsertValue(37);
		pro.InsertValue(45);

		assertArrayEquals(nums, pro.ShowList());
	}
	
}
