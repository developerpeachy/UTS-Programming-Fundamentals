public class MinMax
{
 public static int minPosition(int [] a, int first, int last)
    {
        System.out.print("minPosition(");
        printArray(a);
        System.out.print(", " + first + ", " + last + ");");

        int minPositionSoFar = first;

        for (int i=first+1 ; i<=last ; ++i )
        {
            if ( a[i] < a[minPositionSoFar] )
                minPositionSoFar = i;
        }

        System.out.println(" return minPositionSoFar = " + minPositionSoFar + "  ");

        return minPositionSoFar;

    } 

    public static int isSorted(int [] a, int first, int last)
    {
        System.out.print("isSorted(");
        printArray(a);
        System.out.print(", " + first + ", " + last + ");");

        for (int i=first+1 ; i<=last ; ++i )
        {
            if ( a[i-1] > a[i] )
            {
                System.out.println(" NOT sorted, return something other than 1");
                return -1;
            }
        }
        
        System.out.println(" sorted, so return 1");

        return 1;

    } 

    public static void printArray(int [] a)
    {
        System.out.print("{" + a[0]);

        for (int i=1 ; i<a.length ; ++i )
            System.out.print("," + a[i]);

        System.out.print("}");

    }
}
