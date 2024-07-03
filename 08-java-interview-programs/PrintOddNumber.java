import java.util.Scanner;

/**
 * Print the odd numbers from the given n number
 * n%2==1 then it's an odd number
 */
public class PrintOddNumber {
    public static void printOdd(int n) {
        for(int i=1; i<=n; i++) {
            if(i%2 == 1) {
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printOdd(n);
    }
}
