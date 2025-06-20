/**
 * NOTE: THIS IS NOT STRING REVERSE - this is palindrome but 
 * the name suggests they want you to try it using string reverse
 */

import java.io.*;
import java.util.*;

public class HackerRankJavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder();
        sb.append(A);
        System.out.println(sb.toString());
        System.out.println("A " + A);
        if(A.equals(sb.reverse().toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/**
 * racecar
 * madamimadam
 * adam
 * boob 
 * radar
 * level
 * tacocat
 * hello = no
 * bull = no
 */