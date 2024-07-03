import java.util.Scanner;

/**
 * Print the Fahrenheit table with steps
 * F = ((celsius × 9)/5) + 32
 */
public class PrintFahrenheitTable {
    public static void printFahrenheit(int start, int end, int step) {
        for(int i=start; i<=end; i+=step) {
            int fahrenheit = ((i * 9)/5)+32;
            System.out.println(String.format("%d %d", i, fahrenheit));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start:");
        int start = sc.nextInt();
        System.out.println("Enter the end:");
        int end = sc.nextInt();
        System.out.println("Enter the step:");
        int step = sc.nextInt();
        printFahrenheit(start, end, step);
    }
}
