
class Main11 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((n + n) - 1) - (i + i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
