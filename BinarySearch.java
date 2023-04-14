//package Searching;
//public class BinarySearch {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,0};
//        System.out.println(binary(arr, 9));
//    }
//
//    public static int binary(int[] arr, int target) {
//
//        int first = 0;
//        int last = arr.length - 1;
//        while (first<=last) {
//            int mid = (first + last) / 2;
//            if (arr[mid] == target)
//                return mid;
//            if (arr[mid] > target) {
//                first = mid+1;
//            }
//            if (arr[mid] < target) {
//                last = mid-1;
//            }
//        }
//        return -1;
//    }
//}
