import java.io.*;
import java.util.*;

public class HackerRankJavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        s.close();
        
        // 1. Sum the lengths of A and B
        int sum = A.length() + B.length();
        System.out.println(sum);

        // 2. Determine if is lexicographically larger than (i.e.: does come before in the dictionary?).
        //  The result is a negative integer if this String object lexicographically precedes the argument string
        int compare = A.compareTo(B);
        if (compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize the first letter in and and print them on a single line, separated by a space.
        String capA = A.substring(0,1).toUpperCase();
        String capB = B.substring(0,1).toUpperCase();
        String Acapped = capA + A.substring(1);
        String Bcapped = capB + B.substring(1);
        
        System.out.println(Acapped + " " + Bcapped);
    }
}

/**
 * Straightforward
 * To run: `java HackerRankJavaStringsIntroduction.java`
 */