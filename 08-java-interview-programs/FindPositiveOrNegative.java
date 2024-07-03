/**
 * Find the given  number is positive or negative number
 * If the number is greater than or equal to 0 then it's a positive number
 * If the number less than 0 then it's a negative number
 */
public class FindPositiveOrNegative {
    public static void checkPositiveOrNegative(int num) {
        if(num >= 0) {
            System.out.println(num+" is a positive number");
        } else {
            System.out.println(num+" is a negative number");
        }
    }

    public static void main(String[] args) {
        checkPositiveOrNegative(20);
        checkPositiveOrNegative(-4);
        checkPositiveOrNegative(11);
        checkPositiveOrNegative(-21);
    }
}
