import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankJavaRegex {
    private static class MyRegex {
        final static Pattern pat = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String testMe = sc.next();
            Matcher match = MyRegex.pat.matcher(testMe);
            Boolean ans = match.find();
            System.out.println(String.valueOf(ans));
        }
        sc.close();
    }
}

/**
 * Straightforward - used new-to-me classes Pattern and Matcher
 * https://www.hackerrank.com/challenges/java-regex/problem
 */
