import java.util.*;
public class HackerRankJavaStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        String smallest = s.substring(0,k);
        String greatest = s.substring(0,k);
        String test;
        for(int i = 1; i <= s.length() - k; i++){
            test = s.substring(i,i+k);
            if(smallest.compareTo(test) > 0) smallest = test;
            if(greatest.compareTo(test) < 0) greatest = test;
        }
        System.out.println(smallest + "\n" + greatest);
    }
}


/**
 * 
 * Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k. 
 */
// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true