class LC_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 1};
        // naive approach
        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             result[0] = i;
        //             result[1] = j;
        //             return result;
        //         }
        //     }
        // }

        HashMap<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int test = target - nums[i];
            if (lookup.containsKey(test)){
                result[0] = i; 
                result[1] = lookup.get(test); 
                return result;
            } else {
                lookup.put(nums[i], i);
            }
        }

        return result;
    }
}

// "two-sum"
// https://leetcode.com/problems/two-sum/