class reverse {
    public static void main(String args[]){
        int num = 15342;
        int rev = 0;
        System.out.println("Original Number: " + num);
        while(num > 0){
            int lastDigit = num % 10;
            rev = rev * 10 + (lastDigit);
            num=num/10;
        }
        System.out.print("Reversed Number: "+ rev);
        System.out.println();
    }    
}
