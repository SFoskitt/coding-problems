import java.util.HashMap;
import java.util.Map;

class LC_12 {
    static String intToRoman(int num) {
      String ans = "";
      int[] lookupNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
      String[] lookupLet = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

      for(int i = 0; i < lookupNum.length; i++) {
        while(num >= lookupNum[i]){
          ans = ans.concat(lookupLet[i]);
          num = num - lookupNum[i];
        }
      }

      return ans;
    }

    public static void main(String[] args) {
      String n = args[0];
      int num = Integer.parseInt(n);
      System.out.println(intToRoman(num));
    }
}