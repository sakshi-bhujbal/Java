package Pattern;
public class PascalsTriangle {

    public static int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String args[]) {
        int n = 5; // Number of rows you want to print

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print Pascal's triangle values
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(j) * factorial(i - j)) + " ");
            }
            System.out.println();
        }
    }
}
