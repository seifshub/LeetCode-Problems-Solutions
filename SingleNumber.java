import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=1;i<l;i+=2)
        {
            if(nums[i]!=nums[i-1]) return nums[i-1];
        }
        return nums[l-1];
    }
}