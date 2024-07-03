import java.util.Scanner;

/**
 * Print the Celsius table with steps
 * C = (fahrenheit - 32) * 5/9
 */
public class PrintCelsiusTable {
    public static void printCelsius(int start, int end, int step) {
        for(int i=start; i<=end; i+=step) {
            int celsius = (i-32) * 5/9;
            System.out.println(String.format("%d %d", i, celsius));
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
        printCelsius(start, end, step);
    }
}
