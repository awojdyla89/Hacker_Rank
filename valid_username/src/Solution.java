import java.util.Scanner;
class UsernameValidator {

    // ^  start of string
    // [a-zA-z] Matches any characters between a-z or A-Z.
    // \\w Matches any letter, digit or underscore. Equivalent to [a-zA-Z0-9_]
    // {7,29} Matches between 7 and 29 times, as many times as possible, giving back as needed (greedy)
    // $ end of string

    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";

}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}