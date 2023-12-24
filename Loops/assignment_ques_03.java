// Write a program to print the multiplication table of a number N, entered by the user.
import java.util.*;
class assignment_ques_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Multiplication Table for " + n + ":");
        for(int i=1;i<11;i++){
            System.out.print(n+" x "+i+ " = " + (n*i)+"\t");
            System.out.println();
        }
    }
}