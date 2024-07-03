import java.util.Scanner;

/**
 * Check for the given number is prime number or not.
 * Prime means the number divisible by 1 or by itself
 */
public class CheckPrimeNumber {
    public static boolean checkPrime(int n) {
        boolean isPrime = true;
        int div = 2;
        while(div < n/2) {
            if(n % div == 0) {
                isPrime = false;
                break;
            }
            div += 1;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        boolean isPrime = checkPrime(n);
        if(isPrime) {
            System.out.println(n+" is a prime number");
        } else {
            System.out.println(n+" is not a prime number");
        }
    }
}
