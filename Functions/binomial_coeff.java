import java.util.*;
public class binomial_coeff{

    public static int factorial(int num){
        int fact=1;
        if(num!=0){
            for(int i=num;i>=1;i--){
                fact = fact * i;
            }
            return fact;
        }
        else {
            return 1;
        }   
    }

    public static double coeff(int n, int r){
        double x = factorial(n)/(factorial(r)*factorial(n-r));
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The coefficient of "+a+"C"+b+" is : " + coeff(a,b));
    }
}