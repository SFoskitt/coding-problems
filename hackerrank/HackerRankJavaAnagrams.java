import java.util.*;

public class HackerRankJavaAnagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        sc.close();

        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
            return;
        }

        ArrayList<String> aList = new ArrayList<String>(Arrays.asList(a.split("")));
        ArrayList<String> bList = new ArrayList<String>(Arrays.asList(b.split("")));
        
        Collections.sort(aList);
        Collections.sort(bList);
        String ans = aList.equals(bList) ? "Anagrams" : "Not Anagrams";
        System.out.println(ans);
    }
}

// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
/**
 * NOTES:
 * 1. straightforward
 * 2. I take issue with calling this comparison "anagram" because, strictly speaking,
 * the definition of an anagram is the words are ALREADY arranged to be anagram to each other.
 * This should technically be called "could these be arranged to become anagrams".
 */