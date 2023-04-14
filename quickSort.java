//public class quickSort {
//    static void swap(int[] arr, int i, int j)
//    {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    static int partition(int[] arr, int beg, int end)
//    {
//        int pivot = arr[end];
//
//        int i = (beg - 1);
//
//        for(int j = beg; j <= end - 1; j++)
//        {
//
//            if (arr[j] < pivot)
//            {
//
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i + 1, end);
//        return (i + 1);
//    }
//    static void quickSort(int[] arr, int beg, int end)
//    {
//        if (beg < end)
//        {
//
//            int split = partition(arr, beg, end);
//            quickSort(arr, beg, split - 1);
//            quickSort(arr, split + 1, end);
//        }
//    }
//
//    // Function to print an array
//    static void printArray(int[] arr, int size)
//    {
//        for(int i = 0; i < size; i++)
//            System.out.println(arr[i] + " ");
//
//    }
//    public static void main(String[] args)
//    {
//        int[] arr = {5,1,7,4,5,2,3};
//        int n = arr.length;
//
//        quickSort(arr, 0, n - 1);
//        printArray(arr, n);
//    }
//}