/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/1319/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Hash Table, Palantir Technologies Palantir Airbnb, Palantir Technologies, Palantir, Airbnb, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-06T07:43:03.738Z
 */

public·class·Solution·{
····public·boolean·containsNearbyDuplicate(int[]·nums,·int·k)·{
······Map<Integer,Integer>map=new·HashMap<>();
······for(int·i=0;i<nums.length;i++){
··········if(map.containsKey(nums[i])){
······}
··············int·prevIdx=map.get(nums[i]);
··········}
····}
··············if(i-prevIdx·>=k)return·false;
··········map.put(nums[i],i);
······return
}
