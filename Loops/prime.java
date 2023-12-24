import java.util.*;
class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n==2){
                System.out.println("The number is a prime number");
        }
        else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == false){
                System.err.println("Number is Composite.");
            }
            else{
                System.out.println("The number is a prime number");
            }

        }
    }
}
