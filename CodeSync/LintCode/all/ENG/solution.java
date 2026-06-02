/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/363/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Opposite Direction Two Pointers, Stack, Two Pointers, Monotonic Stack, Apple, Twitter, Airbnb, Amazon
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-02T07:03:19.213Z
 */

public·class·Solution·{
····public·int·trap(int[]·height)·{
········if·(height·==·null·||·height.length·==·0)·return·0;
········
········int·left·=·0;
········int·right·=·height.length·-·1;
········int·leftMax·=·0;
········int·rightMax·=·0;
········int·totalWater·=·0;
········
········while·(left·<·right)·{
············//·Update·max·heights·seen·so·far·from·both·ends
············if·(height[left]·<·height[right])·{
················if·(height[left]·>=·leftMax)·{
····················leftMax·=·height[left];
················}·else·{
····················totalWater·+=·leftMax·-·height[left];
················}
················left++;
············}·else·{
················if·(height[right]·>=·rightMax)·{
····················rightMax·=·height[right];
················}·else·{
····················totalWater·+=·rightMax·-·height[right];
················}
················right--;
············}
········}
········return·totalWater;
····}
}
