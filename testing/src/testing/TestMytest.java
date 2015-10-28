package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMytest {

	@Test
	public void testAdd() 
	{
	    int x  = 3 ; int y = 4;
	    assertEquals(7, Mytest.add(x,y));
	}

}
