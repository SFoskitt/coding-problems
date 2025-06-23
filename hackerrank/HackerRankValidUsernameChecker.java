import java.util.Scanner;

class UsernameValidator {
    static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class HackerRankValidUsernameChecker {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
        scan.close();
    }
}

// https://www.hackerrank.com/challenges/valid-username-checker/problem
/**  
 * NOTES: The trick here, for me, was the limit on the number of characters.
 * Everything I read suggested that {m, n} was "inclusive" so if you wanted
 * at least 8 and no more than 30 characters then you use 8 and 30. However, 
 * there is a discrepancy either in Java 15 or in the HackerRank interpreter
 * that makes this untrue. The solution required using {7,29}.
 * 
 * 
1. inclusive 8 to 30 characters long
2. only alphanumeric and underscore characters allowed
3. starts only with alpha character
INPUT
    8
    Julia
    Samantha
    Samantha_21
    1Samantha
    Samantha?10_2A
    JuliaZ007
    Julia@007
    _Julia007

OUTPUT
    Invalid
    Valid
    Valid
    Invalid
    Invalid
    Valid
    Invalid
    Invalid
*/