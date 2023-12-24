class break_stmnt {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i==4){
                break;
            }
            System.out.println("I am in loop "+i);
        }
        System.err.println("Outside Loop");
    }    
}
