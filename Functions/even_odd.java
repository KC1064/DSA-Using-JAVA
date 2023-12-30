// Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your method.
import java.util.*;
public class even_odd {

    static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean x = isEven(n);
        if (x==true){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
    
}
