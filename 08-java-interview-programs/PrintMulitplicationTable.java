import java.util.Scanner;

/**
 * Print any multiplication table for the given steps
 * if 5 is multiplication table and step is 12 then it will print the 5th
 * multiplication table with 12 steps
 */
public class PrintMulitplicationTable {
    public static void printTable(int m, int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(i+" * "+ m+" = "+(i * m));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the multiplication table:");
        int m = sc.nextInt();
        System.out.println("Enter the number of steps:");
        int n = sc.nextInt();
        printTable(m, n);
    }
}
