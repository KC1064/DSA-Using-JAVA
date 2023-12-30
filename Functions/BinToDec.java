public class BinToDec{

    static void Decimal(int num){
        int n = num;
        int dec = 0;
        int x;
        int pow = 0;
        while(n>0){
            x = n%10;
            dec+= Math.pow(2,pow);
            pow++;
            n=n/10;
        }
    System.out.println("Decimal for Binary number "+ num + " is: "+ dec);
    }
    public static void main(String[] args) {
        Decimal(1110101);
    }
}