public class BubSortSize04{
	private static void debug(String message, int [] x, int i)
    {   
        System.out.println(message + ": ");
        System.out.print("  ");
        MinMax.printArray(x);
        System.out.println();
        System.out.print("  ");

        if ( MinMax.maxPosition(x,0,i) != i )
        {
            System.out.println("  ... no! (i.e. your code contains a bug)");
            System.out.print("  ... MinMax.maxPosition(");
            MinMax.printArray(x);
            System.out.println(",0," + i + ") != " + i);
            return;
        }

        System.out.print("  ");

        if ( MinMax.isSorted(x,i,x.length-1) != 1 )
        {
            System.out.println("  ... no! (i.e. your code contains a bug)");
            return;
        }  

        System.out.println("  ... yes! (i.e. your code *may* be working so far)");     
    }

    public static void bubSort04(int [] a){
    	System.out.print("Array to be sorted: ");
    	MinMax.printArray(a);
    	System.out.println();

    	int tempMin, tempMax, i; 

    	i = 0; 
    	tempMin = MinMax.min(a[i], a[i+1]);
    	tempMax = MinMax.max(a[i], a[i+1]);
    	a[i] = tempMin;
    	a[i+1] = tempMax;

    	i = i +1; 
    	tempMin = MinMax.min(a[i], a[i+1]);
    	tempMax = MinMax.max(a[i], a[i+1]);
    	a[i] = tempMin;
    	a[i+1] = tempMax;

    	i = i +1; 
    	tempMin = MinMax.min(a[i], a[i+1]);
    	tempMax = MinMax.max(a[i], a[i+1]);
    	a[i] = tempMin;
    	a[i+1] = tempMax;

    	debug("The maximum element should have bubbled to the top ", a, 3);

    	i = 0; 
    	tempMin = MinMax.min(a[i], a[i+1]);
    	tempMax = MinMax.max(a[i], a[i+1]);
    	a[i] = tempMin;
    	a[i+1] = tempMax;

    	i = i +1; 
    	tempMin = MinMax.min(a[i], a[i+1]);
    	tempMax = MinMax.max(a[i], a[i+1]);
    	a[i] = tempMin;
    	a[i+1] = tempMax;

    	debug("The second largest element should have bubbled to it's position ", a, 2);

    	i = 0; 
    	tempMin = MinMax.min(a[i], a[i+1]);
    	tempMax = MinMax.max(a[i], a[i+1]);
    	a[i] = tempMin;
    	a[i+1] = tempMax;

    	debug("All elements should be in their sorted position ", a, 1);


    }
}