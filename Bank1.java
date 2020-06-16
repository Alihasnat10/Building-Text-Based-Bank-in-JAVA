import java.util.Scanner;
public class Bank1 {

	public static void main(String[] args) {
		//bank variables
		Scanner input = new Scanner(System.in);
		
		int user_input;
		int size = 0;
		double[] accountBalances = new double[250];
		String[] accountNames = new String[250];
		
		for (;true;) {
		// Bank's Main Menu
		System.out.println("Bank Admin Menu: ");
		System.out.println("Please enter a Menu option: ");
		System.out.println("(1): Add customer to the bank");
		System.out.println("(2): Change Customer Name");
		System.out.println("(3): Check Account Balance");
		System.out.println("(4): Modify Account Balance");
		System.out.println("(5): Accounts Summary");
		System.out.println("(-1): Quit");
		
		user_input = input.nextInt();
		if (user_input == 1) {
			System.out.println("--BANK ADD CUSTOMER MENU--");
			System.out.println("Please enter an account balance:");
			
			double balance = input.nextDouble();
			accountBalances[size] = balance;
			
			System.out.println("Please enter an account name:");
			input.nextLine();
			String name = input.nextLine();
			accountNames[size] = name;
			
			System.out.println("The customer ID is: " + size);
			size += 1;
			
		}
		else if (user_input == 2) {
			System.out.println("--BANK CHANGE NAME MENU--");
			System.out.println("Please enter the customer ID to change their name:");
			
			int index = input.nextInt();
			System.out.println("Enter the customer's new name: ");
			input.hasNextLine();
			
			accountNames[index] = input.nextLine();
		}
		else if (user_input == 3) {
			System.out.println("--BANK CHECK BALANCE MENU--");
			System.out.println("Please enter the customer ID to check their balance:");
			
			int index = input.nextInt();
			double balance = accountBalances[index];
			
			System.out.println("This customer has $" + balance + " in their account");
			
		}
		else if (user_input == 4) {
			System.out.println("--BANK MODIFY BALANCE MENU--");
			System.out.println("Please enter the customer ID to modify their balance:");
			
			int index = input.nextInt();
			
			System.out.println("Please enter the new balance: ");
			accountBalances[index] = input.nextDouble();
			
		}
		else if (user_input == 5) {
			System.out.println("--BANK ALL CUSTOMER SUMMARY MENU--");
			
			double total = 0;
			
			for (int i = 0; i < size ; i++) {
				total += accountBalances[i];
				System.out.println(accountNames[i] + " has $" + accountBalances[i] + "in their account.");
			}
			
			System.out.println("Total balance in the bank : $" + total);
		}
		else if (user_input == -1) {
			System.exit(-1);
		}
		else {
			System.out.println("ERROR: Please enter a correct option.");
		}
	}}

}
