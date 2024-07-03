import java.util.Scanner;

/**
 * Find the sum of n number by getting the input from Scanner
 * input should be in the same line with spaces
 * Add the array value to the sum variable then print the same
 */
public class FindSumOfArray2 {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void printArray(int[] arr) {
        System.out.println("Elements in the array:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        printArray(arr);
        int sum = sumOfArray(arr);
        System.out.println("Sum = "+sum);
    }
}
