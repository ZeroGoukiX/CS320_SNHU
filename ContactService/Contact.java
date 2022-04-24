package contact;


public class Contact{

		private String id;
		private String firstName;
		private String lastName;
		private String number;
		private String address;
		
		//throws arguments for invalid added contacts
		public Contact(String id, String firstName, String lastName, String number, String address) {
			if(id == null || id.length()> 10) {
				throw new IllegalArgumentException("Invalid id");
			}
			if(firstName == null || firstName.length()> 10) {
				throw new IllegalArgumentException("Invalid first name");
			}
			if(lastName == null || lastName.length()> 10) {
				throw new IllegalArgumentException("Invalid last name");
			}
			if(number == null || number.length()< 10 || number.length()> 10) {
				throw new IllegalArgumentException("Invalid number");
			}
			if(address == null || address.length()> 30) {
				throw new IllegalArgumentException("Invalid address");
			}
			
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.number = number;
			this.address = address;
		}
		
		//call id
		public String getID() {
			return id;
		}
		public void setID(String id) {
			this.id = id;
		}
		
		//call first name and set first name
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		//call last name and set last name
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		//call number and set last number
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		
		//call address and set address
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		public String toString() {
			String id = getID();
			String firstname = getFirstName();
			String lastname = getLastName();
			String number = getNumber();
			String address = getAddress();
			
			return id +" "+ firstname +" "+ lastname +" "+ number +" "+ address;
		}
}
