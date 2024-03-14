public class largest_num {
    public static int LargestNum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int num[] = { 23, 54, 22, 65, 74, 192, 38, 29, 89, 99 };
        System.out.println(LargestNum(num));
    }
}
