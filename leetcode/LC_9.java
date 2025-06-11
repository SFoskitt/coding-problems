class LC_9 {
    static boolean isPalindrome(int x) {
        String xStr = Integer.toString(x);
        char[] xArr = xStr.toCharArray();
        int len = xArr.length;
        for (int i = 0; i < len/2; i++){
            if(xArr[i] != xArr[len-1-i]) return false;
        }
        return true;
    }

    public static void main(String[] args){
      int x = Integer.parseInt(args[0]);
      System.out.println(isPalindrome(x));
    }
}

// this is how it looked when I submitted it last