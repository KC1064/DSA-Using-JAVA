//Print the reverse of the num
class reverse_num {
    public static void main(String[] args) {
        int num = 12345;
        while(num > 0){
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num=num/10;
        }
        System.out.println();
    }
}
