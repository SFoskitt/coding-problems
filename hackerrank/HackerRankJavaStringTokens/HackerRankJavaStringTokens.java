import java.util.*;

public class HackerRankJavaStringTokens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String clean1 = s.trim().replaceAll("[^A-Za-z]", " ");
        String clean2 = clean1.trim().replaceAll("( )+", " ");

        if(clean2.length() == 0){
            System.out.println(0);
            return;
        } else {
            String[] arr = clean2.split(" ");
            int len = arr.length;
            System.out.println(len);

            for(int i = 0; i < len; i++){
                System.out.println(arr[i]);
            }
        }
    }
}

// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
/**
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * Then, print the number of tokens, followed by each token on a new line.
 * 
 * NOTE: Given how many workarounds I needed to do for this, I question whether this is the
 * most elegant solution. Frankly, I coded for the tests so maybe not.
 */