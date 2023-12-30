// Write a Java method to compute the average of three numbers..
import java.util.*;
public class Avg_2_number {
    static double average(double a, double b, double c){
    return (a + b + c) / 3;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();  
        double y = average(num1, num2, num3);
        System.out.println("Average of "+ num1 + ", "+ num2 + " and "+ num3 + " is: "+y);        
    }    
}
