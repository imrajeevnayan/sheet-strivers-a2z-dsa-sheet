/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/2506
 * Language: Java
 * Difficulty: Unknown
 * Topics: PRE, please contact us via "Problem Correction", StackString, Stack, String, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-03T08:37:34.485Z
 */

········//·leftover·'('·are·invalid
········while·(!stack.isEmpty())·{
············remove[stack.pop()]·=·true;
········}

········StringBuilder·sb·=·new·StringBuilder();
········for·(int·i·=·0;·i·<·n;·i++)·{
············if·(!remove[i])·{
················sb.append(s.charAt(i));
············}
········}

········return·sb.toString();
····}
}
