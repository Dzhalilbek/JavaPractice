package my_own_practice;

public class BankClass {
	
	// step 1 - create variables: place holders to keep the data

			// personal info
			String firstName;
			String midName;
			String lastName;
			int age;
			// contact info
			String address;
			String phoneNumber;
			String email;
			// balance / account variables
			String accounNumber;
			double balance;
			// credentials
			String userName;
			String password;
			String pin;

			// create constructors: will help us create an instance of the class/object
			// the responsibility of a constructor is to initialize all of the variables of
			// my class

			// default
			
			public BankClass() {
				// step 1 - create variables: place holders to keep the data

				// personal info
				firstName = "";
				midName = "";
				lastName = "";
				age = 0;
				// contact info
				address = "";
				phoneNumber = "";
				email = "";
				// balance / account variables
				accounNumber = "";
				balance = 0;
				// credentials
				userName = "";
				password = "";
				pin = "";
			}
			public BankClass(String fn, String mn, String ln, int a, String add, String phone, String em, String acc,
					double bal, String user, String pass, String p) {
				// step 1 - create variables: place holders to keep the data

				// personal info
				firstName = fn;
				midName = mn;
				lastName = ln;
				age = a;
				// contact info
				address = add;
				phoneNumber = phone;
				email = em;
				// balance / account variables
				accounNumber = acc;
				balance = bal;
				// credentials
				userName = user;
				password = pass;
				pin = p;
				
			}
			
			public void printFullName() {
				System.out.println("First Name: " + firstName + "\nMid Name: " + midName+ "\nLast Name: " + lastName);
			}
			
			public void printAccountInfor() {
				System.out.println("Account Number: " + accounNumber + "\nBalance is: " + balance);
			}

}
