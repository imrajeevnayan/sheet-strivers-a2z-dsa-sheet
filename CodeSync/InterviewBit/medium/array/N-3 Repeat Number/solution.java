/*
 * Platform: InterviewBit
 * Problem: N/3 Repeat Number
 * URL: https://www.interviewbit.com/problems/n3-repeat-number/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Noble Integer 43 Minutes Easy Asked in:, 31.9%
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-06T08:50:09.922Z
 */

public class Solution {
    public int repeatedNumber(final List<Integer> a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = a.size();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 3) return num;
        }
        return -1;
    }
}
