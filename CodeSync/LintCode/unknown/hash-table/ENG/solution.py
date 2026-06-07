# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/209/
# Language: Python
# Difficulty: Unknown
# Topics: Hash TableString, Hash Table, String, Bloomberg Amazon Microsoft Google, Bloomberg, Amazon, Microsoft, Google
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-07T18:04:32.874Z

public·class·Solution·{
··public·char·firstUniqChar(String·str)·{
···Map<Character,Integer>map=new·HashMap<>();
···for(char·c:str.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
···for·(int·i·=·0;·i<str.length();·i++)·{
·······char·c·=str.charAt(i);
········if·(map.get(c)·==·1)·return·c;·
····}
···return·'·';
····}
}
