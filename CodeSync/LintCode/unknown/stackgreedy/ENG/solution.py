# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/1721/
# Language: Python
# Difficulty: Unknown
# Topics: StackGreedy, Stack, Greedy, Facebook, 2506 Remove the Invalid Parentheses Easy, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-04T17:24:23.620Z

public·class·Solution·{
····public·int·minAddToMakeValid(String·s)·{
·········int·left=0,right=0;
········for(char·c:s.toCharArray()){
············if(c=='(')·left++;
············else{
················if(left·>0)·left--;
················else·right++;
············}
········}
········return·left+right;
····}
}
