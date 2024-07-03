import java.util.Scanner;

/**
 * Reverse the whole number
 * input: 1234 output: 4321
 * 2nd Pattern = take the last digit * Math.pow(10, digit-1) and continue till end
 */
public class ReverseNumbers {
    //using string
    public static int reverseNumber1(int n) {
        String reverse = "";
        while(n > 0) {
            reverse += String.valueOf(n%10);
            n = n / 10;
        }
        return Integer.parseInt(reverse);
    }

    public static int findDigit(int n) {
        int digit = 0;
        while (n > 0) {
            digit++;
            n = n/10;
        }
        return digit;
    }

    public static int reverseNumber2(int n) {
        int digit = findDigit(n);
        int result = 0;
        while(digit > 0) {
            //take the last digit
            int right_no = n % 10;
            //remove the last digit
            n = n / 10;
            //append the last digit to the first
            result += (right_no * (int)(Math.pow(10, digit-1)));
            digit--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        int ans = reverseNumber1(n);
        System.out.println("Method1: "+ans);
        ans = reverseNumber2(n);
        System.out.println("Method2: "+ans);
    }
}

