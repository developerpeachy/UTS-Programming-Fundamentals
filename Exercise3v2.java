
public class Exercise3
{
    public static double[] reverse(double[] elements)
    {
        double temp;

        temp  = numbers[5]; //temp = 6
        numbers[5] = numbers[0]; // 6 = 1
        numbers[0] = temp; // 1 = 6

        temp = numbers[4]; //temp = 5
        numbers[4] = numbers[1]; //2 = 5
        numbers[1] = temp; //2 = 5;

        temp = numbers[3]; //temp = 4
        numbers[3] = numbers[2]; //4 = 3 
        numbers[2] = temp; // 3 = 4
        
        return elements;
    }
}
