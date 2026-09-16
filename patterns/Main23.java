
class Main23 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (10) - (i + i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        //  int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i + i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
