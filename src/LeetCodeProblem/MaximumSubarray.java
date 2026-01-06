package LeetCodeProblem;

/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/

//Medium
public class MaximumSubarray {

    public void main(String[] args){
        MaximumSubarray maximumSubarray=new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray((new int[]{-2,1,-3,4,-1,2,1,-5,4})));
    }
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int tempSum=0;
        for (int num : nums) {
            tempSum = tempSum + num;
            if (tempSum > sum) {
                sum = tempSum;
            }
            if (tempSum < 0) {
                tempSum = 0;
            }
        }
        return sum;

    }
}
