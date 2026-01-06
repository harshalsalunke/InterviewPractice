package LeetCodeProblem;

import java.util.HashMap;

public class TwoSum {
    /*Given an array of integers nums and an integer target, return indices of the two numbers such
    that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

    static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] indices = twoSum.twoSum(nums, target);
        System.out.println("[" + indices[0] + "," + indices[1] + "]");
        int[] indicesUsingHashMap = twoSum.twoSumUsingHashMap(nums, target);
        System.out.println("[" + indicesUsingHashMap[0] + "," + indicesUsingHashMap[1] + "]");
    }
    //Method 1 Which is slow as time complexity is O(n^2) because we are using nested loop
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    indices = new int[]{i, j};
                }
            }
        }

        return indices;
    }

    //Method 2 Which is fast as time complexity is O(n) because we are using HashMap
    public int[] twoSumUsingHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;
            if (map.containsKey(needed)) {
                System.out.println("HashMap: " + map.get(needed) + "," + i);
                return new int[]{map.get(needed), i};
            } else {
                map.put(current, i);
            }
        }
        return new int[]{};
    }
}
