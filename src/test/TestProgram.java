package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProgram {

	@Test
	public void test() {
		int value = 20;
		boolean expected = true;
		
		assertEquals(expected, Program.Insert(value));
	}

}
