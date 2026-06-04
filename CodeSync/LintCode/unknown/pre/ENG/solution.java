/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/834/
 * Language: Java
 * Difficulty: Unknown
 * Topics: PRE, please contact us via "Problem Correction", Stack, Google, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-04T09:56:40.157Z
 */

public·class·Solution·{
····public·String·removeDuplicateLetters(String·s)·{
·····HashMap<Character,Integer>map=new·HashMap<>();
·····Stack<Character>st=new·Stack<>();
·····int·freq[]=new·int[26];
·····for(char·c:s.toCharArray())·freq[c-'a']++;
·····for(char·c:s.toCharArray){
·········freq[c-'a']--;
·····}
····}
·········if(map.contains(c))·cont
}
