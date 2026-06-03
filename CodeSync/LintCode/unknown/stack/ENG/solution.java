/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/263
 * Language: Java
 * Difficulty: Unknown
 * Topics: Stack, 2506 Remove the Invalid Parentheses Easy, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-03T07:32:16.499Z
 */

public·class·Solution·{
····public·boolean·matchParentheses(String·string)·{
········Stack<Character>·st·=·new·Stack<>();
········for·(char·ch·:·string.toCharArray())·{
············if·(ch·==·'('·||·ch·==·'{'·||·ch·==·'[')·st.push(ch);
············else·{
················if·(st.isEmpty())·return·false;
················char·top·=·st.pop();
················if·((ch·==·')'·&&·top·!=·'(')·||
····················(ch·==·'}'·&&·top·!=·'{')·||
····················(ch·==·']'·&&·top·!=·'['))·{
····················return·false;
················}
············}
········}
