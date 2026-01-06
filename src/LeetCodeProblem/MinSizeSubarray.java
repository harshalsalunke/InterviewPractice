package LeetCodeProblem;

public class MinSizeSubarray {
/*Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or equal to target.
If there is no such subarray, return 0 instead.
Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.*/

    public void main(String[] args){
        MinSizeSubarray minSizeSubarray=new MinSizeSubarray();
        System.out.println(minSizeSubarray.minSubArrayLen1(7,new int[]{2,3,1,2,4,3}));
    }
    public int minSubArrayLen(int target, int[] nums) {
        int minLength=0;
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target)
            {
                minLength=1;
            }
            sum=sum+nums[i];
            count++;
            if (sum>=target) {
                minLength=count;
                sum=0;
                count=0;
            }



        }
        return minLength;
    }

    public int minSubArrayLen1(int target, int[] nums){
        int length=Integer.MAX_VALUE;
        int left=0, right=0,sum=0;
        for(right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                int currentLength=right-left+1;
                length=Math.min(currentLength,length);
                sum=sum-nums[left];
                left++;
            }

        }
        if(length==Integer.MAX_VALUE)
            return 0;
        else
            return length;

    }
}
