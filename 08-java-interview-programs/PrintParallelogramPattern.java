import java.util.Scanner;

/**
 * Print the parallelogram pattern like below
 *     ***         *****
 *      ***         *****
 *       ***         *****
 *                    *****
 *                     *****
 */
public class PrintParallelogramPattern {
    public static void printPattern(int n) {
        int i = 1;
        while(i <= n) {
            int spacer = 0;
            while(spacer < i-1) {
                System.out.print(" ");
                spacer += 1;
            }
            int j = 1;
            while(j <= n) {
                System.out.print("*");
                j = j+1;
            }

            System.out.println();
            i = i+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printPattern(n);
    }
}
