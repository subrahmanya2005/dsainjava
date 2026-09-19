public class Main24 {
    public static void printPattern(int n) {
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

              
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - minDistance) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}