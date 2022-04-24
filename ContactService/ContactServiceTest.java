package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ContactServiceTest {
	List<String> list = new ArrayList<>();
	
	
	@Test
	public void testListInit(){
		assertTrue(list.isEmpty());
		assertTrue(list.size() == 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInvalidCapacity(){
		list = new ArrayList<String>(-1);
	}
	
	@Test
	public void testAddElements(){
		list.add(0, "0123456789");
		list.add(1, "Firstname");
		list.add(2, "Lastname");
		list.add(3, "5551234567" );
		list.add(4, "AddressofContact");
		
		assertEquals("0123456789", list.get(0));
		assertEquals("Firstname", list.get(1));
		assertEquals("Lastname", list.get(2));
		assertEquals("5551234567", list.get(3));
		assertEquals("AddressofContact", list.get(4));
		
		assertTrue(list.size()==5);
	}
	
	@Test
	public void testSetElement(){
		list.add(0, "0123456789");
		list.add(1, "Firstname");
		list.add(2, "Lastname");
		list.add(3, "5551234567" );
		list.add(4, "AddressofContact");
		
		list.set(1, "Max");
		
		assertEquals("0123456789", list.get(0));
		assertEquals("Max", list.get(1));
		assertEquals("Lastname", list.get(2));
		assertEquals("5551234567", list.get(3));
		assertEquals("AddressofContact", list.get(4));
	}
	
	@Test
	public void testRemoveElement(){
		list.add(0, "0123456789");
		list.add(1, "Firstname");
		list.add(2, "Lastname");
		list.add(3, "5551234567" );
		list.add(4, "AddressofContact");
		
		
		assertEquals("Firstname", list.remove(1));
		
		assertTrue(list.size() == 4);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testRemoveWithEmptyList(){
		list.remove(0);
	}
}


