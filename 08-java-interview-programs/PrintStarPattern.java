import java.util.Scanner;

/**
 * Print the star pattern like below
 *      *          *
 *     ***        ***
 *      *        *****
 *                ***
 *                 *
 */
public class PrintStarPattern {
    public static void printPattern(int n) {
        int i = 1;
        int p = 1;
        int s = 1;
        int mid = n/2+1;

        while(i <= n) {
            if(i > mid) {
                p =  p +1;
            }else {
                p = n-i-(mid -1);
            }

            int spaces = 1;
            while(spaces <= p) {
                System.out.print(" ");
                spaces += 1;
            }

            int j = 1;
            if(i > mid) {
                s = s-2;
            }else{
                s = (i+i-1);
            }
            while(j <= s) {
                System.out.print('*');
                j = j+1;
            }

            i = i+1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printPattern(n);
    }
}
