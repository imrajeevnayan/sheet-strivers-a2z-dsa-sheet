/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/1201/
 * Language: Java
 * Difficulty: Unknown
 * Topics: StackMonotonic Stack, Stack, Monotonic Stack, Google, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-05-31T19:06:47.916Z
 */

public·class·Solution·{
····public·int[]·nextGreaterElements(int[]·nums)·{
········int·n·=·nums.length;
········Stack<Integer>·st·=·new·Stack<>();
········int[]·res·=·new·int[n];
········Arrays.fill(res,·-1);
········for·(int·i·=·0;·i·<·2·*·n;·i++)·{
············int·num·=·nums[i·%·n];
············while·(!st.isEmpty()·&&·nums[st.peek()]·<·num)·{
················res[st.pop()]·=·num;
············}
············if·(i·<·n)·{
················st.push(i);
············}
········}

········return·res;
····}
}
