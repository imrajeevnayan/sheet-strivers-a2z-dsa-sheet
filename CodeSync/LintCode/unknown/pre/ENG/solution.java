/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/2506
 * Language: Java
 * Difficulty: Unknown
 * Topics: PRE, please contact us via "Problem Correction", StackString, Stack, String, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-03T08:37:48.577Z
 */

············}·else·if·(c·==·')')·{
················stack.push(i);
············if·(c·==·'(')·{

············char·c·=·s.charAt(i);
········for·(int·i·=·0;·i·<·n;·i++)·{

········Deque<Integer>·stack·=·new·ArrayDeque<>();
········boolean[]·remove·=·new·boolean[n];
····public·String·removeParentheses(String·s)·{
········int·n·=·s.length();
public·class·Solution·{
················if·(!stack.isEmpty())·{
····················stack.pop();·//·matched
················}·else·{
