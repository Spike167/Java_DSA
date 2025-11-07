import java.util.Scanner;

public class LinearSearch
{
    static int linear_search(int array[], int elem)  // O(n)
    {
        for (int i = 0, length = array.length; i < length; i++)
        {
            if (array[i] == elem)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        System.out.print("Linear Search\n");
        Scanner sc = new Scanner(System.in);
        int array[] = {25, 11, 88, 9, 101, 50, 72, 69, 95, 47};
        System.out.print("Enter Number to Search: ");
        int elem = sc.nextInt();

        int index = linear_search(array, elem);
        if (index == -1)
        {
            System.out.print("Number Not Found\n");
        }
        else
        {
            System.out.print("Number Found at Index: " + index + "\n");
        }
    }
}
