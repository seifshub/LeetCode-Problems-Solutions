import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int x;
        int[] ans=new int[2];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            x=target-nums[i];
            if(m.containsKey(x) && m.get(x)!=i) 
            {
                ans[0]=i;
                ans[1]=m.get(x);
                break;
            }
            else m.put(nums[i],i);
        }
        return ans;
    }
}
