/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/2506
 * Language: Java
 * Difficulty: Unknown
 * Topics: PRE, please contact us via "Problem Correction", StackString, Stack, String, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-03T08:37:05.050Z
 */

public·class·Solution·{
····public·String·removeParentheses(String·s)·{
········StringBuilder·sb·=·new·StringBuilder();
········for·(char·c·:·s.toCharArray())·{
············if·(c·!=·'('·&&·c·!=·')')··sb.append(c);
········}
········return·sb.toString();
····}
}
