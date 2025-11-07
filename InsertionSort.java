public class InsertionSort
{
    static void insertion_sort(int array[], int length)  //O(n^2)
    {
        for (int i = 1; i < length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (array[i] < array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Insertion Sort\n");
        int array[] = {25, 11, 88, 9, 101, 50, 72, 69, 95, 47};
        int length = array.length;

        System.out.print("Before: ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");

        insertion_sort(array, length);

        System.out.print("After:  ");
        for(int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");
    }
}
