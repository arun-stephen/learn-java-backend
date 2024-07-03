import java.util.Scanner;

/**
 * Find m power of n and m, n are the user input
 * (m ^ n) = m * n times e.g. (2 ^ 3) = 2*2*2
 */
public class FindPower {
    public static int power(int m, int n) {
        int result = 1;
        for(int i =0; i<n; i++) {
            result *= m;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int m = sc.nextInt();
        System.out.println("Enter the power:");
        int n = sc.nextInt();
        System.out.println(m+"^"+n+" = "+power(m, n));
    }
}
