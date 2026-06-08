/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/268/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Stack, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-08T18:44:10.798Z
 */

class·Solution·{
····public·int·scoreOfParentheses(String·s)·{
········Stack<Integer>·stack·=·new·Stack<>();
········stack.push(0);

········for·(char·c·:·s.toCharArray())·{
············if·(c·==·'(')·{
················stack.push(0);
············}·else·{
················int·v·=·stack.pop();
················int·top·=·stack.pop();

················if·(v·==·0)·{
····················stack.push(top·+·1);
················}·else·{
