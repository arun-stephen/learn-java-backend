import java.util.Scanner;
import java.util.Stack;

/**
 * Convert the decimal number into binary and decimal means to the base of 10
 * We can divide this number to 2 upto end then finally take the value from the reverse order
 */
public class ConvertDecimalToBinary {
    //using string
    public static void convertDecimalToBinary1(int n) {
        String binaryValue = "";
        while (n > 0) {
            binaryValue += String.valueOf(n % 2);
            n = n / 2;
        }
        for(int i=binaryValue.length()-1; i >=0; i--) {
            System.out.print(binaryValue.charAt(i)+" ");
        }
    }

    //using stack
    public static void convertDecimalToBinary2(int n) {
        Stack<Integer> result = new Stack<Integer>();
        while(n > 0) {
            result.push(n%2);
            n = n / 2;
        }
        while (!result.isEmpty()) {
            System.out.print(result.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        convertDecimalToBinary1(n);
        System.out.println();
        convertDecimalToBinary2(n);
    }
}
