public class BankAccountOO
{
    private static double interestRate = 0.0;

    private final int accountNumber;
    
    private String accountName;

    private double balance; 

    public BankAccountOO (int num, String name)
    {
        accountNumber = num;
        accountName = name;
        balance = 0.0;
    } 

   
    public BankAccountOO (int num, String name, double bal)
    {
        accountNumber = num;
        accountName = name;
        balance = bal;
        
    } 

    
    public double withdraw(double amount)
    {  
        if ( balance >= amount )
        {
            balance = balance - amount;
            return balance;
        }
        else
            return -1.0;
    }

  
    public static void setInterestRate(double newInterest)
    {
        interestRate = newInterest;
    }


    public static double getInterestRate()
    {
        return interestRate;
    }

    public String toString()
    {
        return "accountNumber = "  + accountNumber +
               " accountName = "   + accountName   +
               " balance = "       + balance;
    }

} 
