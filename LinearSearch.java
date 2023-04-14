package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        System.out.println(LinearSearch(arr,4));

    }

        public static int LinearSearch(int[] arr,int target) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target)
                    return i;

            }
            return -1;
        }
}
