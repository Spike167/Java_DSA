import java.util.Scanner;

public class BinarySearch
{
    static int binary_search(int array[], int elem)  // O(log n)
    {
        int low = 0;
        int high = array.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (array[mid] == elem)
            {
                return mid;
            }
            else if (elem > array[mid])
            {
                low = mid + 1;
            }
            else if (elem < array[mid])
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.print("Binary Search\n");
        Scanner sc = new Scanner(System.in);
        int array[] = {9, 11, 25, 47, 50, 69, 72, 88, 95, 101};
        System.out.print("Enter Number to Search: ");
        int elem = sc.nextInt();

        int index = binary_search(array, elem);
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
