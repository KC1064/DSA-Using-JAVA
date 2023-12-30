// Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
import java.util.*;

public class palindrome {
    static boolean palin_check(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int x = temp % 10;
            rev = rev * 10 + x;
            temp /= 10;
        }
        return num == rev;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        System.out.println("Is Palindrome: " + palin_check(n));
    }
}
