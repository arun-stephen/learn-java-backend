import java.util.Scanner;

/**
 * Print the half diamond pattern like below
 *     *
 *     *1*
 *     *121*
 *     *12321*
 *     *121*
 *     *1*
 *     *
 */
public class HalfDiamondPattern {
    public static void printPattern(int n) {
        System.out.println("*");
        int i = 1;
        int p = 1;

        while(i <= n+(n-1)) {
            System.out.print("*");

            if(i > n) {
                p = p -1;
            }else {
                p = i;
            }

            int j = 1;
            while(j <= p) {
                System.out.print(j);
                j = j+1;
            }

            int desc = p-1;
            while(desc >= 1) {
                System.out.print(desc);
                desc -= 1;
            }
            System.out.print("*");
            i = i+1;
            System.out.println();
        }
        System.out.println("*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printPattern(n);
    }
}
