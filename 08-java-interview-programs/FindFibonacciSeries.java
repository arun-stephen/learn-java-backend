import java.util.Scanner;

/**
 * Fibonacci Series F(1)=1, F(2)=1 F(3)=F(1)+F(2)
 * N=8 then F(N)=1, 1, 2, 3, 5, 8, 13, 21
 */
public class FindFibonacciSeries {
    public static void printFibonacci(int n) {
        if(n == 1 || n == 2) {
            System.out.print("1");
            return;
        }
        int num1 = 1;
        int num2 = 1;
        System.out.print(num1+" "+num2+" ");
        for(int i=3; i<=n; i++) {
            int sum = num1+num2;
            System.out.print(sum+" ");
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printFibonacci(n);
    }
}
