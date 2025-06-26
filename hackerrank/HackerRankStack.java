import java.util.*;

public class HackerRankStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> dict = new HashMap<>();
        dict.put(')', '(');
        dict.put('}', '{');
        dict.put(']', '[');
        Set<Character> opens = new HashSet<>(Arrays.asList('(', '{', '['));

        while(sc.hasNext()){
            Stack<Character> stack = new Stack<>();
            String test = sc.next();
            // String test = args[0];
            boolean ans = true;
            for(int i = 0; i < test.length(); i++){
                Character c = test.charAt(i);
                if(opens.contains(c)){
                    stack.push(c);
                } else {
                    // when empty stack then ans == false at this point because 
                    // it implies this string or substring starts with a closed char
                    if (stack.empty()){
                        ans = false;
                        break;
                    } else {
                        char x = stack.pop();
                        if(x != dict.get(c)){
                            ans = false;
                            break;
                        }
                    }
                }
            }

            if(!stack.empty()) ans = false;

            System.out.println(ans);
        }
        
        sc.close();
    }
}

// https://www.hackerrank.com/challenges/java-stack/problem
/**
 * NOTES: This is "balanced parens" and the title of the problem
 * suggests you'll need a stack to do that.
 * 
 * The closed-char logic branch tripped me up for a while and
 * remembering the "close char when empty stack" scenario
 * helped a lot.
 */
