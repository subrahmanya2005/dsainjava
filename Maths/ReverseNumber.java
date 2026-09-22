class ReverseNumber {
    public static void main(String[] args) {
        int  n =778994;
        int reversed=0;
        
        while (n!=0) { 
            int lastdigit=n%10;
            n /=10;
            reversed= (reversed*10)+lastdigit; 
        }
        System.out.println("reversed is "+reversed);
    }
}
