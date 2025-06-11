class LC_11 {
    static int maxArea(int[] height) {
        int len = height.length;
        int max = 0;

        for(int i = 0, j = len-1; i <= j;) {
            int dist = j - i;
            int hi = height[i];
            int hj = height[j];
            int minHt = hi < hj ? hi : hj;
            int vol = dist * minHt;
            if (vol > max) max = vol;
            if(hi > hj) { 
              j--;
            } else {
              i++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
      int len = args.length;
      int[] height = new int[len];
      for (int i = 0; i < len; i++){
        height[i] = Integer.parseInt(args[i]);
      }
      
      System.out.println(maxArea(height));
    }
}