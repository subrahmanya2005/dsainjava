
class PrimeNumber {

    public static void main(String[] args) {
        boolean isPrime=true;
        int n = 7;
        if(n<=1){
            isPrime=false;
        }
        for (int i = 2; i*i<=n; i++) {
            if (n% i==0) {
                isPrime=false;
                 break;
                
            }
          
            
        }
        if (isPrime) {
            System.out.println("yes it is Prime number");
        } else {
            System.out.println("Not a prime number");
        }

    }
}
