/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/943/
 * Language: Java
 * Difficulty: Medium
 * Topics: Prefix Sum ArrayArray, Prefix Sum Array, Array, OpenAI, Test Data Commit Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-10T17:22:39.080Z
 */

········for·(int·i·=·1;·i·<·nums.length;·i++)·{
············ans[i]·=·ans[i·-·1]·+·nums[i];

····public·NumArray(int[]·nums)·{
········ans·=·new·int[nums.length];

········ans[0]·=·nums[0];

····public·int·sumRange(int·i,·int·j)·{
········}
····}
········if·(i·==·0)·return·ans[j];
class·NumArray·{
····int[]·ans;
········return·ans[j]·-·ans[i·-·1];
