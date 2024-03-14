public class binary_Search {
    public static int BinarySearch(int arr[], int item) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item == arr[mid]) {
                return mid;
            } else if (arr[mid] > item) {
                high = mid - 1;
            } else if (arr[mid] < item) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 24, 4, 6, 32, 7, 44, 68, 97 };
        int test = BinarySearch(num, 32);
        if (test != -1) {
            System.out.println("Element is present at index " + (test + 1) + " of array");
        } else {
            System.out.println("Element not present");
        }
    }

}
