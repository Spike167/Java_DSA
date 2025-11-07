public class MergeSort
{
    static void merge_sort(int array[], int length)  //O(nlog n)
    {
        if (length <= 1)
        {
            return;
        }
        int mid = length / 2;
        int left_array[] = new int[mid];
        int right_array[] = new int[length - mid];

        int j = 0;
        for (int i = 0; i < length; i++)
        {
            if (i < mid)
            {
                left_array[i] = array[i];
            }
            else
            {
                right_array[j] = array[i];
                j++;
            }
        }
        merge_sort(left_array, mid);
        merge_sort(right_array, length - mid);
        merge(array, length, left_array, right_array);
    }

    static void merge(int array[], int length, int left_array[], int right_array[])
    {
        int i, l, r;
        i = l = r = 0;
        int left_size = length / 2;
        int right_size = length - left_size;
        while (l < left_size && r < right_size)
        {
            if (left_array[l] <= right_array[r])
            {
                array[i] = left_array[l];
                i++;
                l++;
            }
            else
            {
                array[i] = right_array[r];
                i++;
                r++;
            }
        }
        while (l < left_size)
        {
            array[i] = left_array[l];
            i++;
            l++;
        }
        while (r < right_size)
        {
            array[i] = right_array[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Merge Sort\n");
        int array[] = {25, 11, 88, 9, 101, 50, 72, 69, 95, 47};
        int length = array.length;

        System.out.print("Before: ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");

        merge_sort(array, length);

        System.out.print("After:  ");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");
    }
}
