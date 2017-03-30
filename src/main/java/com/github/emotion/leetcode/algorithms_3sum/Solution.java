package com.github.emotion.leetcode.algorithms_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 周朵
 * @date 2017/03/30
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ) {
            int target = 0 - nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if (sum > target) {
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.add(nums[start]);
                    arrayList.add(nums[end]);
                    list.add(arrayList);
                    do {
                        start++;
                    } while (start < end && nums[start] == nums[start - 1]);
                    do {
                        end--;
                    } while (start < end && nums[end] == nums[end + 1]);
                }
            }
            do {
                i++;
            } while (i < nums.length - 2 && nums[i] == nums[i - 1]);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums));
    }
}