import java.util.Scanner;

/**
 * Print the odd numbers from the given n number
 * n%2==0 then it's an even number
 */
public class PrintEvenNumber {
    public static void printEven(int n) {
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printEven(n);
    }
}
