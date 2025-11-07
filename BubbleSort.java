public class BubbleSort
{
    static void bubble_sort(int array[], int length)  //O(n^2)
    {
        for (int i = 0; i < length - 1; i++)
        {
            for (int j = 0; j < length - 1 - i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Bubble Sort\n");
        int array[] = {25, 11, 88, 9, 101, 50, 72, 69, 95, 47};
        int length = array.length;

        System.out.print("Before: ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");

        bubble_sort(array, length);

        System.out.print("After:  ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");
    }
}
