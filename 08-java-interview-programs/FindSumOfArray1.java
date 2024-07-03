/**
 * Find the sum of n given numbers
 * Add the array value to the sum variable then print the same
 */
public class FindSumOfArray1 {
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
        int[] arr = {10, 5, 3, 17, 21, 8, 9};
        printArray(arr);
        int sum = sumOfArray(arr);
        System.out.println("Sum = "+sum);
    }
}
