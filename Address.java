package phoneBookClasses;

public class Address {

	private String streetNumber;
	private String city;
	private String state;
	private String zipCode;
	
	public Address() {
	}
	
	public Address(String streetNumber, String city, String state, String zipCode) {
		this.streetNumber = streetNumber;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String getStreetNumber() {
		return this.streetNumber;
	}
	
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
		
	public String getzipCode() {
		return this.zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ "]";
	}

	
	
}
