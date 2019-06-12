import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class LinkedListTest {
	
	@Test
	public void testPushBackAddsOneNode()
	{
		LinkedList instance = new LinkedList();
		instance.pushBack(12);
		assertEquals(1,instance.getSize());
	}
	
	@Test
	public void testPopBackRemovesCorrectNode()
	{
		LinkedList instance = new LinkedList();
		instance.pushBack(12);
		instance.pushBack(34);
		assertEquals(34,instance.popBack());

	}
	
	@Test
	public void testEraseRemovesCorrectNode()
	{
		LinkedList instance = new LinkedList();
		instance.pushBack(12);
		instance.pushBack(34);
		assertEquals(34,instance.elementAt(1));

	}
	
	@Test
	public void testEraseDoesNothingIfNoNode()
	{
		LinkedList instance = new LinkedList();
		instance.popBack();
		//assertEquals("List is empty",instance.size);
	}
	
	@Test
	
	public void testElementAtReturnNode() 
	{
		LinkedList instance = new LinkedList();
		instance.pushBack(12);
		instance.pushBack(34);
		instance.pushBack(6);
		instance.pushBack(65);
		assertEquals(6,instance.elementAt(2));
		
	}
	
	@Test
	public void testElementAtReturnsNoNodeIfIndexDoesNotExsit()
	{
		LinkedList instance = new LinkedList();
		instance.popBack();
		//assertEquals("List is empty",instance.size);
	}
	
	@Test
	public void testSizeReturnsCorrectSize()
	{
		LinkedList instance = new LinkedList();
		instance.pushBack(12);
		instance.pushBack(34);
		instance.pushBack(6);
		instance.pushBack(65);
		assertEquals(4,instance.getSize());
		
	}

}
