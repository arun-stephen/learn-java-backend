import java.util.Scanner;

/**
 * Find the factors of a given n number
 * If any number divide n which remainder is 0 then it's a factor of n
 */
public class FindFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int div = 2;
        while(div < n) {
            if(n % div == 0) {
                System.out.print(div+" ");
            }
            div += 1;
        }
    }
}
