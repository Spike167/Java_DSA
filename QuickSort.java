public class QuickSort
{
    static void quick_sort(int array[], int length, int start, int end)  //O(nlog n)
    {
        if (start > end)
        {
            return;
        }
        int pivot = partition(array, length, start, end);
        quick_sort(array, length, start, pivot - 1);
        quick_sort(array, length, pivot + 1, end);
    }

    static int partition(int array[], int length, int start, int end)
    {
        int pivot = end;
        int j = start - 1;
        for (int i = start; i < end; i++)
        {
            if (array[i] < array[pivot])
            {
                j++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        j++;
        int temp = array[j];
        array[j] = array[pivot];
        array[pivot] = temp;
        return j;
    }

    public static void main(String[] args)
    {
        System.out.print("Quick Sort\n");
        int array[] = {25, 11, 88, 9, 101, 50, 72, 69, 95, 47};
        int length = array.length;

        System.out.print("Before: ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");

        quick_sort(array, length, 0, length - 1);

        System.out.print("After:  ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");
    }
}
