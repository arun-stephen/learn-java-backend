import java.util.Scanner;

/**
 * Find the factorial of n number and get the input of n from the user
 * n! = 1*2*3....*n
 */
public class FindFactorial {
    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }
}
