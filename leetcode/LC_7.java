class Solution {
    public int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();

        try {
            if (x < 0) {
                return Integer.parseInt(reversed) * -1;
            } else {
                return Integer.parseInt(reversed);
            }
        } catch(NumberFormatException e){
            System.out.println("exception: :" + e);
            return 0;
        }
    }
}


/**
 Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

 For int, from -2147483648 to 2147483647, inclusive

 NOTE: with Java string reverse this was easier than Leetcode "medium"
 */