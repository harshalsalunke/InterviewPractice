package LeetCodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.threeSum(num));

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int end = nums.length - 1;

            while (left < end) {
                int sum = nums[i] + nums[left] + nums[end];
                if (sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[left], nums[end]));
                    left++;
                    end--;
                    while (left < end && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (sum > 0)
                    end--;
                else if (sum < 0)
                    left++;
            }
        }

        return results;
    }
}
