import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size : ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target  ");
        int target= sc.nextInt();
        System.out.println(LinearSearch(arr,target));
    }
    public static int LinearSearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target)
                return i;
        }
        return -1;
    }

}
