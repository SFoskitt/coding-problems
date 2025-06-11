// Leetcode #727 -  Remove Duplicates from Sorted Array   

public int removeDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length-1 && nums[i] != -9999){
            if(nums[i] == nums[i+1]){
                for(int j = i; j < nums.length -1; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = -9999;
            } else {
                i++;
            }
        }
        return i;
    }


int removeDupes(int[] nums) {
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }

// top solution is abbreviated of what I came up with
// below solution is what someone else came up with
// the difference is your solution modifies an array in place and returns an integer because they wanted an integer (not a modified array)
// the bottom solution only counts the number of unique numbers and modifies nothing in the array
// two problems:
// 1. you did not follow the instruction - you returned a number and were thrown off by all the "hints" about "modify in place"
// 2. as a result, you did way more work than necessary to arrive at the solution
// "way more work" is two things -- 1. nested loop, and 2. array modification
// also note they used a "look-back" instead of your "look-ahead" - the look-back prevents the out-of-bounds access error you had (and fixed with a -1 in two places)
// overall their solution is correct and elegant, yours is cumbersome and chunky
