import java.io.*;
import java.util.*;

public class HackerRankJavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ans = String.valueOf(t);
        sc.close();
        
        if(ans instanceof String){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}

/**
 * Straightforward
 * To run: `java HackerRankJavaIntToString.java`
 */