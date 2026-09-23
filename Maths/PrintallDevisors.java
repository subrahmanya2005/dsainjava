import java.util.ArrayList;
import java.util.Iterator;

class PrintAllDivisors {

    static ArrayList<Integer> list = new ArrayList<>();

    static void printAllDivisors(int n) {

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {

                list.add(i);

                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
    }

    public static void main(String[] args) {

        printAllDivisors(36);

        list.sort(null);

        for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}