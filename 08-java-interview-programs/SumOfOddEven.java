import java.util.Scanner;

/**
 * Write a program to input an integer N and print the sum of all its even digits
 * and sum of all its odd digits separately.
 * Digits mean numbers, not the places! That is, if the given integer is "13245",
 * even digits are 2 & 4 and odd digits are 1, 3 & 5.
 */
public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sumOfOdd = 0;
        int sumOfEven = 0;

        if(n >= 0) {
            while(n > 0) {
                int num = n % 10;
                if(num%2 == 0) {
                    sumOfEven += num;
                } else {
                    sumOfOdd += num;
                }
                n = n/10;
            }
            System.out.println(sumOfEven+" "+sumOfOdd);
        } else {
            System.out.println("Invalid input");
        }
    }
}
