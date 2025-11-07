public class SelectionSort
{
    static void selection_sort(int array[], int length)  //O(n^2)
    {
        for (int i = 0; i < length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < length; j++)
            {
                if (array[j] < array[min])
                {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Selection Sort\n");
        int array[] = {25, 11, 88, 9, 101, 50, 72, 69, 95, 47};
        int length = array.length;

        System.out.print("Before: ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");

        selection_sort(array, length);

        System.out.print("After:  ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");
    }
}
