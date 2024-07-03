import java.util.Scanner;

/**
 * Print the parallelogram pattern like below
 *   1=1
 *   1+2=3
 *   1+2+3=6
 *   1+2+3+4=10
 */
public class SumPattern {
    public static void printPattern(int n) {
        int i = 1;
        while(i <= n) {
            int sum = 0;
            int j = 1;
            while(j <= i) {
                sum += j;
                if(j == i){
                    System.out.print(j+"="+sum);
                }else{
                    System.out.print(j+"+");
                }
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printPattern(n);
    }
}
