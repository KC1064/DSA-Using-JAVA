public class DecToBin {
    static void Binary(int num){
        int n = num;
        int digit =0;
        int x = 0;
        int pow = 0;
        while(n>0){
            digit = n%2;
            x+=digit*Math.pow(10, pow);
            pow++;
            n = n/2;
        }
        System.out.print("Binary representation of "+num+" is: "+x);
    }
    public static void main(String[] args) {
        Binary(5);
    }
} 
