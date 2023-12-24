// Write a program to find the factorial of any number entered by the user
import java.util.*;
class assignment_ques_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number: ");
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial: "+fact);
    }
}
