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
    public static void BubSort04(int [] a){
        System.out.print("Array to be sorted: ");
        MinMax.array.println(a);
        System.out.println();

        int tempMin, tempMax, i;

        i = 0;
        tempMin = MinMax.min(a[i], a[i+1]);
        tempMax = MinMax.max(a[i], a[i+1]);
        a[i] = tempMin;
        a[i+1] = tempMax;

        i = i+1;
        tempMin = MinMax.min(a[i], a[i+1]);
        tempMax = MinMax.max(a[i], a[i+1]);
        a[i] = tempMin;
        a[i+1] = tempMax;

        i = i+1;
        tempMin = MinMax.min(a[i], a[i+1]);
        tempMax = MinMax.max(a[i], a[i+1]);
        a[i] = tempMin;
        a[i+1] = tempMax;

        //debug 

        i = 0;
        tempMin = MinMax.min(a[i], a[i+1]);
        tempMax = MinMax.max(a[i], a[i+1]);
        a[i] = tempMin;
        a[i+1] = tempMax;

        i = i+1;
        tempMin = MinMax.min(a[i], a[i+1]);
        tempMax = MinMax.max(a[i], a[i+1]);
        a[i] = tempMin;
        a[i+1] = tempMax;

        //debug 

        i = 0;
        tempMin = MinMax.min(a[i], a[i+1]);
        tempMax = MinMax.max(a[i], a[i+1]);
        a[i] = tempMin;
        a[i+1] = tempMax;
    }
}