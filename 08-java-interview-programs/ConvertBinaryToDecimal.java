import java.util.Scanner;

/**
 * Convert a binary number to the decimal. Binary number contains the 0 and 1.
 * Binary number has the base 2.
 * Input: 1100 output=1*2^3+1*(2^2)+0*(2^1)+0*(2^0) = 8+4+0+0 = 12
 */
public class ConvertBinaryToDecimal {
    public static int convertBinaryToDecimal(int n) {
        int count = 0;
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(2, count) * (n % 10);
            n = n / 10;
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        int ans = convertBinaryToDecimal(n);
        System.out.println("Result: "+ans);
    }
}
