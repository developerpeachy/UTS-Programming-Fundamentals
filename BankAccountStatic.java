public class BankAccountStatic {
	private static int accountNumber = 0;
	private static String accountName = "no name";
	private static double balance; 

	public static int getAccountNumber(){
	return accountNumber;
	}
	public static void setAccountNumber(int newAccountNumber){
		accountNumber = newAccountNumber;
	}

	public static String getAccountName(){
		return accountName;
	}

	public static void setAccountName(String newName){
		accountName = newName;
	}

	public static double getBalance(){
		return balance;
	}

	public static void deposit(double amount){
		balance = balance + amount;
	}

	public static double withdraw(double amount){
		if (balance >= amount){
			balance = balance - amount;
			return balance;
		}
		else 
		{
			return -1.0;
		}
	}
	
}