public class LC_11 {
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

    public static void testMaxArea() {
      int[] test1 = {1,1};
      assert maxArea(test1) == 1;

      int[] test2 = {1,8,6,2,5,4,8,3,7};
      assert maxArea(test2) == 49;

      System.out.println("tests ran");
    }

    public static void main(String[] args) {
      testMaxArea();
      int len = args.length;
      int[] height = new int[len];
      for (int i = 0; i < len; i++){
        height[i] = Integer.parseInt(args[i]);
      }

      System.out.println("maxArea " + maxArea(height));
    }
}