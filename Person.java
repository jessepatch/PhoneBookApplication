package phoneBookClasses;

public class Person {

	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private Address address;

	public Person() {
		
	}
	
	public Person(String firstName,String lastName,String phoneNumber,Address address) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", phoneNumber=" + "(" + phoneNumber.substring(0,3) + ")" + phoneNumber.substring(3,6) + "-"  + phoneNumber.substring(6) + ", address=" + address.toString() + "]";
	}
	
	
	
}
