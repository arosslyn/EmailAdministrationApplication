package emailapp;

public class Emailapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email email1 = new Email("John", "Smith");
		email1.setMailboxCapacity(500);
		System.out.println(email1.showInfo());

	}

}
