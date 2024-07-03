import java.util.Scanner;

/**
 * Print the different character pattern like below
 * A A A A    A B C D    A B C D     A          A          D           D
 * B B B B    A B C D    B C D E     B B        B C        C C         C D
 * C C C C    A B C D    C D E F     C C C      C D E      B B B       B C D
 * D D D D    A B C D    D E F G     D D D D    D E F G    A A A A     A B C D
 */
public class DifferentCharPattern {
    public static void printPattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                char ch = (char) ('A'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                char ch = (char) ('A'+j-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        int p;
        for(int i=1; i<=n; i++) {
            p = i;
            for(int j=1; j<=n; j++) {
                char ch = (char) ('A'+p-1);
                p++;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern4(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                char ch = (char) ('A'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern5(int n) {
        int p;
        for(int i=1; i<=n; i++) {
            p = i;
            for(int j=1; j<=i; j++) {
                char ch = (char) ('A'+p-1);
                p++;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern6(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                char ch = (char) ('A'+n-i);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern7(int n) {
        char p;
        for(int i=1; i<=n; i++) {
            p = (char) ('A'+n-i);
            for(int j=1; j<=i; j++) {
                System.out.print(p+" ");
                p = (char) (p+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        printPattern1(n);
        System.out.println();
        printPattern2(n);
        System.out.println();
        printPattern3(n);
        System.out.println();
        printPattern4(n);
        System.out.println();
        printPattern5(n);
        System.out.println();
        printPattern6(n);
        System.out.println();
        printPattern7(n);
    }
}
