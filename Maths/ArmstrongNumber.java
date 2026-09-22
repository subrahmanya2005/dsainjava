
class ArmstrongNumber {
// ArmstrongNumber
    public static void main(String[] args) {
        int n = 1;
        int temp=n;
        int sum = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            n /= 10;
            sum += lastdigit * lastdigit * lastdigit;

        }
        if(sum==temp){
            System.out.println("Yes it is a arm Strong Number");
        }
        else{
            System.out.println("not  a");
        }
    }
}
