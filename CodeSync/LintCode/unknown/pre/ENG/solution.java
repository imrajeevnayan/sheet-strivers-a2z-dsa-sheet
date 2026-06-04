/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/834/
 * Language: Java
 * Difficulty: Unknown
 * Topics: PRE, please contact us via "Problem Correction", Stack, Google, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-04T09:57:29.186Z
 */

·····for(char·c:s.toCharArray){
·········freq[c-'a']--;
·········if(map.contains(c))·continue;
·········while·(!st.isEmpty()·&&·st.peek()·>·c·&&·freq[st.peek()·-·'a']·>·0)·{
················map.remove(st.pop());
············}
············st.push(c);
············map.add(c);
········}
·····Stack<Character>st=new·Stack<>();
·····for(char·c:s.toCharArray())·freq[c-'a']++;
·····HashMap<Character,Integer>map=new·HashMap<>();
·····int·freq[]=new·int[26];
····public·String·removeDuplicateLetters(String·s)·{
public·class·Solution·{
