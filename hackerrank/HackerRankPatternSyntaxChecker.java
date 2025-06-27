import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HackerRankPatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            PatternSyntaxException pse = null;
            try {
                Pattern.compile(s);
            } catch(PatternSyntaxException e){
                pse = e;
            }
            if(pse == null){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        sc.close();        
    }
}


// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
/**
 * NOTE: Stuck on this for a while. When int n = sc.nextInt() then I ended up with the next line being
 * a blank line and breaking all the tests with an incorrect "Valid" for the first result of every test.
 * Changing this to int n = Integer.parseint(sc.nextLine()) fixed everything.
 */