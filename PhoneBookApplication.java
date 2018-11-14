package phoneBookClasses;

import java.util.Scanner;

public class PhoneBookApplication {

	public static Person[] contacts = new Person[0];

	public static void main(String[] args) {
				
		System.out.println("Welcome to MyAddressBook!");
		Person[] contacts = new Person[0];
		
		//Main Menu
		while (true) {
		System.out.println("Choose an option");
		System.out.println("1. Add an Entry");
		System.out.println("2. Delete an Entry");
		System.out.println("3. Update an Entry");
		System.out.println("4. Search by First Name");
		System.out.println("5. Search by Last Name");
		System.out.println("6. Search by Full Name");
		System.out.println("7. Search by Phone Number");
		System.out.println("8. Search by City");
		System.out.println("9. Search by State");
		System.out.println("10. Display all entries");
		System.out.println("11. Exit");
		Scanner input = new Scanner(System.in);

		switch (input.nextInt()) {
		case 1 : System.out.println("Please enter the entry information in this format: First Name, Middle Name, Last Name, Steet Address, City, State, Zipcode, Phone Number e.g. 5552195859");
				
		Scanner input1 = new Scanner(System.in);
		String mess = input1.nextLine();
				int x = 0;
				int commaCount = 0;
				Person person1 = new Person();
				Address address1 = new Address();

	try {
				int countError = 0;
				for(int i = 0; i < mess.length();i++) {
				if(mess.charAt(i) == ',') {
					countError++;
					}
				}
				
				//this will catch if there is an error in how the input was entered
				if(countError != 7) {
					throw new InputFormatException();
				}
				
				//This deciphers the input into the correct format
				for(int i = 0; i < mess.length(); i++) {
					if(mess.charAt(i) == ',') {
						if(commaCount == 6) {
							address1.setZipCode(mess.substring(x,i));
							x = i + 2;
							person1.setPhoneNumber(mess.substring(x));						}
						if(commaCount == 5) {
							address1.setState(mess.substring(x,i));
							x = i + 2;
							commaCount++;
						}
						if(commaCount == 4) {
							address1.setCity(mess.substring(x,i));
							x = i + 2;
							commaCount++;
						}
						if(commaCount == 3) {
							address1.setStreetNumber(mess.substring(x,i));
							x = i + 2;
							commaCount++;
						}
						if(commaCount == 2) {
							person1.setLastName(mess.substring(x,i));
							x = i + 2;
							commaCount++;
						}
						if(commaCount == 1) {
							person1.setMiddleName(mess.substring(x,i));
							x = i + 2;
							commaCount++;
						}
						if(commaCount == 0) {
							person1.setFirstName(mess.substring(0,i));
							x = i + 2;
							commaCount++;
						} 
					}
					}
				person1.setAddress(address1);
				Person[] tempArray = new Person[contacts.length + 1];
				for (int i = 0; i < contacts.length; i++) {
					tempArray[i] = contacts[i];
				}
				tempArray[contacts.length] = person1;
				contacts = tempArray;

				
				for(int y = 0; y < contacts.length; y++) {
				System.out.println(contacts[y].toString());
				}
	} catch (InputFormatException e) {
		System.out.println(e);	
		}
				
			break;
		case 2 : System.out.println("Please enter the phone number of the contact to delete in this format: 5558881234");
		Scanner input7 = new Scanner(System.in);
		Person[] temporaryArray = new Person[contacts.length - 1];
		String tempPhoneNumber = input7.next();
				int count = 0;
				for(int i = 0; i < contacts.length; i++) {
					if(!contacts[i].getPhoneNumber().equals(tempPhoneNumber)) {
						temporaryArray[count] = contacts[i]; 
						count++;
			}
		}
				contacts = temporaryArray;

		for(int y = 0; y < contacts.length; y++) {
			System.out.println(contacts[y].toString());
			}
			break;
		case 3 : System.out.println("Please enter the phone number of the contact you wish to edit");
		for (int i = 0; i < contacts.length; i++) {
			if(contacts[i].getPhoneNumber().equals(input.next())) {
				System.out.println(contacts[i].toString());
				System.out.println("Which field would you like to edit (only 1 field may be edited at a time)");
				System.out.println("1. first name");
				System.out.println("2. middle name");
				System.out.println("3. last name");
				System.out.println("4. address");
				System.out.println("5. city");
				System.out.println("6. state");
				System.out.println("7. zipcode");
				System.out.println("8. phone number");
				
				switch (input.nextInt()) {
				case 1 : System.out.println("Enter new first name");
				contacts[i].setFirstName(input.next());
					break;
				case 2 : System.out.println("Enter new middle name");
				Scanner input6 = new Scanner(System.in);
				contacts[i].setMiddleName(input6.nextLine());
					break;
				case 3 : System.out.println("Enter new last name");
				contacts[i].setLastName(input.next());
					break;
				case 4 : System.out.println("Enter new address");
				Scanner input3 = new Scanner(System.in);
				contacts[i].getAddress().setStreetNumber(input3.nextLine());
					break;
				case 5 : System.out.println("Enter new city");
				Scanner input4 = new Scanner(System.in);
				contacts[i].getAddress().setCity(input4.nextLine());
					break;
				case 6 : System.out.println("Enter new state");
				contacts[i].getAddress().setState(input.next());
					break;
				case 7 : System.out.println("Enter new zipcode");
				contacts[i].getAddress().setZipCode(input.next());
					break;
				case 8 :System.out.println("Enter new phone number");
				contacts[i].setPhoneNumber(input.next());
					break;
				}
				
				System.out.println(contacts[i].toString());

			}
		}
			break;
		case 4 : System.out.println("Enter first name");
		String firstName = input.next();
		for (int i = 0; i < contacts.length; i++) {
			if(contacts[i].getFirstName().equals(firstName)) {
				System.out.println(contacts[i].toString());
			}
		}
			break;
		case 5 : System.out.println("Enter last name");
		String lastName = input.next();
		for (int i = 0; i < contacts.length; i++) {
			if(contacts[i].getLastName().equals(lastName)) {
				System.out.println(contacts[i].toString());
			}
		}
			break;
		case 6 : System.out.println("Enter full name");
		String fullName = input.next();
		for (int i = 0; i < contacts.length; i++) {
			if(contacts[i].getFullName().equals(fullName)) {
				System.out.println(contacts[i].toString());
			}
		}
		break;
		case 7 : System.out.println("Enter phone number");
		String phoneNumber = input.next();
		for (int i = 0; i < contacts.length; i++) {
			if(contacts[i].getPhoneNumber().equals(phoneNumber)) {
				System.out.println(contacts[i].toString());
			}
		}
			break;
		case 8 : System.out.println("Enter City");
		String city = input.next();
		for (int i = 0; i < contacts.length; i++) {
			if(contacts[i].getAddress().getCity().equals(city)) {
				System.out.println(contacts[i].toString());
			}
		}
			break;
		case 9 : System.out.println("Enter State");
		String state = input.next();
		for (int i = 0; i < contacts.length; i++) {
			if(contacts[i].getAddress().getState().equals(state)) {
				System.out.println(contacts[i].toString());
			}
		}
			break;
		case 10 : Person[] sorted = new Person[contacts.length];
		
		sorted = contacts.clone();
		Person q = new Person();
		
		for (int p = 0; p < sorted.length; p++) {
			for (int i = 0, j = 1; i < sorted.length - 1; j++, i++) {
			if (sorted[i].getFirstName().compareTo(sorted[j].getFirstName()) > 0) {
				q = sorted[i];
				sorted[i] = sorted[j];
				sorted[j] = q;
			}
			}
		}
		for (int i = 0; i < sorted.length; i++) {
		System.out.println(sorted[i].toString());
		}
			break;
		case 11 :
			System.out.println("Thanks for using MyAddressBook! Come back soon!");
			System.exit(0);
		} 
		}
		
	}
	
	}

