package Pattern;
public class PalindromicPyramid {
    public static void main(String args[]){
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print the first half of the row
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print the second half of the row
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}

