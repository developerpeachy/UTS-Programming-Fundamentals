public class SummerOO
{
    private static int numSummers = 0;

    private int sum;   // sum of all integers received
    private int count; // number of integers received

    public SummerOO()
    {
        ++numSummers;
        sum = 0;
        count = 0;
    } 

    public SummerOO (int firstNumber)
    {
        ++numSummers;
        sum = firstNumber;
        count = 1;
    } 

    /* not static! */ 
    public void putNumber(int newNumber)
    {
        // This method is complete. No changes are required to
        // "putNumber" in the lab test.
        
        sum = sum + newNumber; // could write "sum += newNumber"
        count = count + 1;     // could write "++count"
    }

    public static int getNumSummers()
    {
        return numSummers;
    }

    
    public String toString()
    {
        return "sum = "  +  sum  +  " count = "  +  count;
    }

    public static void main(String [] args)
    { 
        SummerOO summer1 = new SummerOO();
        

        summer1.putNumber(17);
        summer1.putNumber(1);

        System.out.println(summer1.toString());
    
        System.out.println();

        SummerOO summer2 = new SummerOO(3);
       

        summer2.putNumber(5);
        summer2.putNumber(7);
        System.out.println(summer2);
        

    } 

} 
