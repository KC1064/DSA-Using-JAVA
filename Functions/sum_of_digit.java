import java.util.*;
public class sum_of_digit {

    static int sum(int num){
        if (num == 0) 
        return 0;
        else{
            int temp = num;
            int sum = 0;
            while(temp>0){
                sum += temp%10;
                temp/=10;
            }
            return sum;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The sum of digits is : " +sum(number));
    }
}
