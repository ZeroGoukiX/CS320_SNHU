package contact;

import java.util.ArrayList;
import java.util.List;


public class ContactService {
	
	private List<Contact> contactList = new ArrayList<>();
	
	private void addContact (Contact contact) {
		contactList.add(contact);
	}
	private void removeContactByID(String id) {
		for( Contact contact: contactList) {
			if(contact.getID() == id) {
				contactList.remove(contact);
			}
		}
		showContactList();
	}
	
	private void updateContact (Contact contact) {
		contactList.set(1, contact);
			showContactList();
			}

	
	private void showContactList() {
		for (Contact contact : contactList) {
			System.out.println(contact.getID()+ " "+ contact.getFirstName() + " "+ contact.getLastName()
			+ " "+ contact.getNumber() + " "+ contact.getAddress());
		}
		
	}
	
	public static void main(String [] args) {
		ContactService contactservice = new ContactService();
		
		Contact contact1 = new Contact("01", "Mel", "Brooks", "5555555555", "105 Main Street" );
		Contact contact2 = new Contact("02", "Ken", "Masters", "5551234567", "510 Broadway Street");
		Contact contact3 = new Contact("03", "Steve", "Austin", "5553165555", "Austin Texas");
		
		contactservice.addContact(contact1);
		contactservice.addContact(contact2);
		contactservice.addContact(contact3);
		
		contactservice.showContactList();
		
		contactservice.removeContactByID("02");
		
		contactservice.updateContact(new Contact("03", "Steve", "Austin", "5553165555", "Victoria Texas"));
		
		System.out.println();
	}
	
}