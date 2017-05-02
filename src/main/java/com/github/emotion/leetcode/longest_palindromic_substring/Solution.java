package com.github.emotion.leetcode.longest_palindromic_substring;

/**
 * @author 周朵
 * @url https://leetcode.com/problems/longest-palindromic-substring/#/description
 * @date 2017/03/30
 */
public class Solution {
    //    public String longestPalindrome(String s) {
//        boolean[][] flags = new boolean[2][];
//        flags[0] = new boolean[s.length()];
//        flags[1] = new boolean[s.length()];
//        int maxLen = 0;
//        int maxLenStart = 0;
//        for (int len = 1; len <= s.length(); len++) {
//            int index = len % 2;
//            for (int i = 0; i <= s.length() - len; i++) {
//                flags[index][i] = s.charAt(i) == s.charAt(i + len - 1) && (len <= 2 || flags[index][i + 1]);
//                if (flags[index][i] && len > maxLen) {
//                    maxLen = len;
//                    maxLenStart = i;
//                }
//            }
//        }
//        return s.substring(maxLenStart, maxLenStart + maxLen);
//    }
    public boolean longestPalindrome(String s) {
        s = buildString(s);
        int[] palindromeSize = new int[s.length()];
        int largestMid = 0;
        int largest = 0;
        for (int i = 0; i < palindromeSize.length; i++) {
            palindromeSize[i] = 1;
            if (largest > i) {

            } else {
                
            }
        }
        return false;
    }

    private String buildString(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append('^');
        for (int i = 0; i < s.length(); i++) {
            builder.append('#');
            builder.append(s.charAt(i));
        }
        builder.append('#');
        builder.append('$');
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
        System.out.println(solution.longestPalindrome("a"));
        System.out.println(solution.longestPalindrome("aa"));

    }


}
