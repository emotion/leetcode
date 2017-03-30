package com.github.emotion.leetcode.median_of_two_sorted_arrays;

/**
 * @author 周朵
 * @url https://leetcode.com/problems/median-of-two-sorted-arrays/#/description
 * @date 2017/03/30
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if ((len & 1) == 1) {
            return findKth(nums1, nums2, 0, 0, len / 2 + 1);
        } else {
            return (findKth(nums1, nums2, 0, 0, len / 2) + findKth(nums1, nums2, 0, 0, len / 2 + 1)) / 2.0;
        }
    }

    private double findKth(int[] A, int[] B, int A_start, int B_start, int k) {
        if (A.length - A_start > B.length - B_start) {
            return findKth(B, A, B_start, A_start, k);
        }
        if (A.length == A_start) {
            return B[B_start + k - 1];
        }
        if (k == 1) {
            return Math.min(A[A_start], B[B_start]);
        }
        int A_next = Math.min(A_start + k / 2 - 1, A.length - 1);
        int B_next = B_start + k - (A_next - A_start + 1) - 1;
        if (A[A_next] < B[B_next]) {
            return findKth(A, B, A_next + 1, B_start, k - (A_next - A_start + 1));
        } else if (A[A_next] > B[B_next]) {
            return findKth(A, B, A_start, B_next + 1, k - (B_next - B_start + 1));
        } else {
            return A[A_next];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}