import java.util.Scanner;

/**
 * Find all prime number between 2 to N.
 * N=9, output:2 3 5 7
 */
public class PrintAllPrimeNumber {
    public static void printAllPrime(int n) {
        boolean isPrime = true;
        for(int i=2; i<n; i++) {
            isPrime = true;
            for(int j=2; j<i; j++) {
                if(i != j && (i%j) == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printAllPrime(n);
    }
}
