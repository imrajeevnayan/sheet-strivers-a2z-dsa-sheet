# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/3820/
# Language: Python
# Difficulty: Unknown
# Topics: StackString, Stack, String, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-02T10:05:11.177Z

public·class·Solution·{
····public·String·removeDuplicates(String·s)·{
········StringBuilder·sb=new·StringBuilder();
········for(char·c:s.toCharArray()){
············int·len=sb.length();
············if(len·>0·&&·sb.charAt(len-1)==c)sb.deleteCharAt(len-1);
············else·sb.append(c);
········}
········return·sb.toString();
····}
}
