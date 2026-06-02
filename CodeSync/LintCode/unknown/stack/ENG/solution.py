# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/3820/
# Language: Python
# Difficulty: Unknown
# Topics: StackString, Stack, String, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-02T10:06:25.496Z

public·class·Solution·{
····public·String·removeDuplicates(String·s)·{
····Stack<Character>st=new·Stack<>();
····for(char·c:s.toCharArray()){
········if(!st.isEmpty()&&·st.peek()==c)st.pop();
····}
····}
}
