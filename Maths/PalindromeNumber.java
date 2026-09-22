class PalindromeNumber {
    public static void main(String[] args) {
        int  n =5;
        int reversed=0;
        int temp=n;
        while (n!=0) { 
            int lastdigit=n%10;
            n /=10;
            reversed= (reversed*10)+lastdigit; 
        }
        if (temp==reversed) {
            System.out.println("It is a palindrome ");
            
        }
        else{
            System.out.println("Not a ");
        }
    }
}
