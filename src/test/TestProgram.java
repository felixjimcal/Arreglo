package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProgram {

	@Test
	public void Give20OrBigger() 
	{
		int value = 22;
		boolean expected = true;
		
		assertEquals(expected, Program.Insert(20));
		assertEquals(expected, Program.Insert(value));
	}
	
	@Test
	public void GiveLowerThan20() 
	{
		int value = 19;
		boolean expected = false;
		
		assertEquals(expected, Program.Insert(value));
	}

}
