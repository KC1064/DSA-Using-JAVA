import java.util.Scanner;

public class linear_search {
    public static boolean Linear_Search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the length");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search");
        int num = sc.nextInt();
        boolean res = Linear_Search(arr, num);
        if (res == true) {
            System.out.println("Element is present in the array");
        } else {
            System.out.println("Element not present in array.");
        }
    }

}
