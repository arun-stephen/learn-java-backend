import java.util.Scanner;

/**
 * Find the sum or product of N numbers
 * N=numbers, choice=1(sum), 2(product), 3(-1)
 */

public class PrintSumOrProduct {
    private static int sumNums(int n) {
        int sum = 0;
        for(int i=1; i<=n;i++) {
            sum += i;
        }
        return sum;
    }

    private static int productNum(int n) {
        int sum = 1;
        for(int i=1; i<=n;i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the choice:");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice == 1) {
            System.out.println(sumNums(num));
        } else if(choice == 2) {
            System.out.println(productNum(num));
        } else{
            System.out.println(-1);
        }
    }
}
