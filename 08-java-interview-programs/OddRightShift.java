import java.util.Scanner;

/**
 * Find the n of odd numbers then shift the 1st digit to the last
 * N=4
 * 1357
 * 3571
 * 5713
 * 7135
 */
public class OddRightShift {
    public static int getOddNumber(int n) {
        String str = "";
        int i = 1;
        int count = 1;
        while(count <= n) {
            if(i%2 == 1) {
                str += i;
                count++;
            }
            i++;
        }
        return Integer.parseInt(str);
    }

    public static void rotateToRightOddNumber(int n) {
        int num = getOddNumber(n);
        System.out.println(num);
        int i = 1;
        while(i < n) {
            //take the left number
            int left_no = num/(int)(Math.pow(10, n-1));
            //remove the first digit
            num = num % (int)(Math.pow(10, n-1));
            //append the left_no to the right
            num = (num * (int)(Math.pow(10, 1)))+left_no;
            System.out.println(num);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        rotateToRightOddNumber(n);
    }
}
