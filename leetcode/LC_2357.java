import java.util.HashSet;
import java.util.Set;

class LC_2357 {
    public static int minimumOperations(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for (int n : nums){
            if (n > 0){
                ans.add(n);
            }
        }
        return ans.size();
    }

    public static void testMinimumOperations(){
        int[] test1 = {1,5,0,3,5};
        assert minimumOperations(test1) == 3;

        int[] test2 = {0};
        assert minimumOperations(test2) == 0;

        int[] test3 = {1,1,1,1};
        assert minimumOperations(test3) == 1;

        System.out.println("tests ran");
    }

    public static void main(String[] args){
        // [1,5,0,3,5] = 3
        int[] nums = new int[args.length];
        for(int i = 0; i < args.length; i++){
            nums[i] = Integer.parseInt(args[i]);
        }
        testMinimumOperations();
        System.out.println(minimumOperations(nums));
    }
}


/**
 * 
    You are given a non-negative integer array nums. In one operation, you must:

    Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
    Subtract x from every positive element in nums.

    Return the minimum number of operations to make every element in nums equal to 0.
 */