/**
 * Check the given number is odd or even number
 * If the number is divisible by 2 then the number is even or odd
 * % operator will help to find the remainder value.
 */
public class FindOddOrEven {
    public static void checkOddOrEven(int num) {
        if(num %2 == 0) {
            System.out.println(num +" is even number");
        } else {
            System.out.println(num+" is odd number");
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 11;
        checkOddOrEven(num1);
        checkOddOrEven(num2);
    }
}
