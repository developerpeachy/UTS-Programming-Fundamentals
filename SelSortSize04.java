public class SelSortSize04{
	private static void swapPositions(int [] x, int position1, int position2)
    {
        System.out.print("swapPositions(");
        MinMax.printArray(x);
        System.out.print(", " + position1 + ", " + position2 + "); ");

        int temp     = x[position1];
        x[position1] = x[position2];
        x[position2] = temp;

        System.out.print("array now ");
        MinMax.printArray(x);
        System.out.println();

    } 

    public static void selSort04 (int [] a){
    	int minPos, 1;

    	i = 0;
    	minPos = MinMax.minPosition(a, i, 3);
    	swapPositions(a, i, minPos);

    	i = i+1;
    	minPos = MinMax.minPosition(a, i, 3);
    	swapPositions(a, i, minPos);

    	i = i+1;
    	minPos = MinMax.minPosition(a, i, 3);
    	swapPositions(a, i, minPos);
    	
    }


}