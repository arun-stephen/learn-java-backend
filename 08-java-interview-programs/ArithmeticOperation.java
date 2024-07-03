import java.util.Scanner;

/**
 * Perform the arithmetic operation on operands
 * If user give 2 and 5 and select + then perform addition
 */
public class ArithmeticOperation {
    public static void arithmeticCalc(int m, int n, String op) {
        switch (op) {
            case "+":
                System.out.println(m+" + "+n+" = "+(m+n));
                break;
            case "-":
                System.out.println(m+" - "+n+" = "+(m-n));
                break;
            case "*":
                System.out.println(m+" * "+n+" = "+(m*n));
                break;
            case "/":
                if(n == 0) {
                    System.out.println("Divide by zero error");
                    return;
                }
                System.out.println(m+" / "+n+" = "+(m/n));
                break;
            default:
                System.out.println("Invalid arithmetic operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int m = sc.nextInt();
        System.out.println("Enter second number:");
        int n = sc.nextInt();
        System.out.println("Enter the operation:");
        String op = sc.next();
        arithmeticCalc(m, n, op);
    }
}
