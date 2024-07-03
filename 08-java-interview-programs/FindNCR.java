import java.util.Scanner;

/**
 * Find the nCr value
 * nCr = n!/r!(n-r)!
 */
public class FindNCR {
    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        System.out.println("Enter the r value:");
        int r = sc.nextInt();
        int nCr = factorial(n)/(factorial(r) * factorial(n-r));
        System.out.println(n+"C"+r+" = "+nCr);
    }
}
