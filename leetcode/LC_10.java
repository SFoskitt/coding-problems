import java.util.regex.*;

class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pat = Pattern.compile(p);
        Matcher mat = pat.matcher(s);
        return mat.matches();
    }
}

/**
 * NOTE: with Java pattern and matcher classes this is easier than 
 * regular Leetcode "medium".
 */