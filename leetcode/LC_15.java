import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LC_15 {
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i -1]) continue;

            int sln = -nums[i];
            int j = i + 1;
            int k = len -1;
            while(j < k) {
                if (nums[j] + nums[k] == sln){
                    List<Integer> subset = new ArrayList<>();
                    subset.add(nums[i]);
                    subset.add(nums[j]);
                    subset.add(nums[k]);
                    ans.add(subset);
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                } else if (nums[j] + nums[k] > sln) {
                    k--;
                } else if (nums[j] + nums[k] < sln) {
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++){
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(threeSum(nums));
    }
}