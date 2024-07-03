import java.util.Scanner;

/**
 * Print 3N+2 is not multiple of 4
 * N=4, output: 5 11 14 17
 */
public class FindArithmeticProgression {
    public static void printArithmeticProgression(int n) {
        for(int i=1; i<=n; i++) {
            if((3*i+2)%4 == 0) {
                n++;
                continue;
            }
            System.out.print((3*i+2)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printArithmeticProgression(n);
    }
}
