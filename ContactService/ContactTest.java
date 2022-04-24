package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContact() {
			Contact contact = new Contact("0123456789", "Firstname", "Lastname", "5551234567", "AddressofContact");
			assertTrue(contact.getID().equals("0123456789"));
			assertTrue(contact.getFirstName().equals("Firstname"));
			assertTrue(contact.getLastName().equals("Lastname"));
			assertTrue(contact.getNumber().equals("5551234567"));
			assertTrue(contact.getAddress().equals("AddressofContact"));
		}

	@Test
	void testContactidTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567890", "Firstname01", "Lastname", "5551234567", "AddressofContact");
		});	}
	
	@Test
	void testContactidNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Firstname01", "Lastname", "5551234567", "AddressofContact");
		});	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Firstname01", "Lastname", "5551234567", "AddressofContact");
		});	}
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", null, "Lastname", "5551234567", "AddressofContact");
		});	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Firstname", "Lastname012", "5551234567", "AddressofContact");
		});	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Firstname", null, "5551234567", "AddressofContact");
		});	}
	
	@Test
	void testContactNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Firstname", "Lastname012", "55512345678", "AddressofContact");
		});	}
	
	@Test
	void testContactNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Firstname", "Lastname012", "555123456", "AddressofContact");
		});	}
	@Test
	void testContactNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Firstname", "Lastname012", null, "AddressofContact");
		});	}
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Firstname", "Lastname012", "5551234567", "AddressofContact012345678900000");
		});	}
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Firstname", "Lastname012", "5551234567", null );
		});	}
}

