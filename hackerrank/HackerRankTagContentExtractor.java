import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTagContentExtractor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());
 
        java.util.regex.Pattern pat = Pattern.compile("<(.+)>([^<]+)</\\1>");
        while(lines > 0){
            String entry = sc.nextLine();
            Matcher match = pat.matcher(entry);
            boolean found = false;
            while(match.find()){
                System.out.println(match.group(2));
                found = true;
            }
            if(!found) System.out.println("None");
            lines--;
        }

        sc.close();
    }
}

// https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
/**
NOTES: 
    - they send the integer, first scanner entry, as a string so it needs parsed
    - to run this manually, you can't copy/paste all five lines, it has to 
    happen one-by-one, unless you pipe input from a file

INPUT:
    4
    <h1>Nayeem loves counseling</h1>
    <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
    <Amee>safat codes like a ninja</amee>
    <SA premium>Imtiaz has a secret crush</SA premium>

OUTPUT:
    Nayeem loves counseling
    Sanjay has no watch
    None
    Imtiaz has a secret crash
*/