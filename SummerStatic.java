public class SummerStatic{
	private static int sum;
	private static int count;

	public static void main(String [] args){

		//first set of numbers: 
		
		reset();
		putNumber(17);
       putNumber(1);
              
       System.out.print("count = " + getCount() + " ");
       System.out.print("sum = " + getSum() + " ");
       System.out.println("average = " + getAverage());
      
      //Second set of numbers: 
       
       reset(3);
       putNumber(5);
       putNumber(7);
             
       System.out.print("count = " + getCount() + " ");
       System.out.print("sum = " + getSum() + " ");
       System.out.println("average = " + getAverage());

	}

	public static void putNumber(int newNumber){
		sum = sum + newNumber;
		count = count + 1;
	}

	public static void reset(){
		sum = 0;
		count = 0;
	}

	public static void reset(int firstNumber){
		sum = firstNumber;
		count=1;
	}

	public static int getCount(){
		return (count);
	}

	public static int getSum(){
		return (sum);
	}

	public static double getAverage(){
		return( (double) sum / (double) count );
	}
}