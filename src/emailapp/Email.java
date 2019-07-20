package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "beycompany.com";

	
	//generate a constructor to receive the first and last name
	
	
	
	
	
	//set the mailbox capacity
	
	//set the alternate email
	
	//Change the password
	
	public Email(String firstname, String lastname) {
		super();
		this.firstName = firstname;
		this.lastName = lastname;
		
		//call a method asking for the department name
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//call a method that generates a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password: " + this.password);
		
		//combine elements to generate an email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
		//System.out.println(email);
		
	}
	//Ask for the  department
	private String setDepartment () {
		System.out.println("Enter the department code:\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none\n");
		Scanner scanner = new Scanner(System.in);
		
		int deptNumber = scanner.nextInt();
		
		switch(deptNumber) {
		case 1: 
			return "Sales";
		case 2:
			return "Development";
		case 3: 
			return "Accounting";
		default: 
			return "Sorry no such department exists";
		}
		
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
		 int random = (int) (Math.random() * passwordSet.length());
		 password[i] = passwordSet.charAt(random);
		}
		return new String(password);
		
	}
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	public int setMailboxCapacity () {
		return this.mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "\nDISPLAY NAME:" + firstName + " " + lastName +
				"\nCOMPANY EMAIL:" + email + 
				"\nMAILBOX CAPACITY:" + mailboxCapacity + "mb";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
