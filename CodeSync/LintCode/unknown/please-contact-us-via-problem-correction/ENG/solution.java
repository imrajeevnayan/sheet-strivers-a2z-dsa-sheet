/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/834/
 * Language: Java
 * Difficulty: Unknown
 * Topics: PRE, please contact us via "Problem Correction", Stack, Google, Test Data Commit Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-04T09:57:52.425Z
 */

········for·(char·c·:·s.toCharArray())·{
············freq[c·-·'a']--;
············if·(map.contains(c))·continue;
············while·(!st.isEmpty()·&&·st.peek()·>·c·&&·freq[st.peek()·-·'a']·>·0)·{
················map.remove(st.pop());
············}
············st.push(c);
············map.add(c);
········}
········StringBuilder·sb·=·new·StringBuilder();
········for·(char·c·:·st)·sb.append(c);
········return·sb.toString();
·····
····}
}
