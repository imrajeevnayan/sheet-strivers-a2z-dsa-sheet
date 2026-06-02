/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/363/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Opposite Direction Two Pointers, Stack, Two Pointers, Monotonic Stack, Apple, Twitter, Airbnb, Amazon
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-02T07:10:45.836Z
 */

public·class·Solution·{
····public·int·trapRainWater(int[]·heights)·{
········int·ans=0;
········Deque<Integer>st=new·ArrayDeque<>();
········for(int·i=0;i<heights.length;i++){
············while(!st.isEmpty()&&·heights[i]>heights[st.peek()]){
········}
················int·top=st.pop();
············}
····}
················if(st.isEmpty())break;
··········st.push(i);············
········return·ans;

················int·dist=i-st.peek()-1;
················int·boundHeight=Math.min(heights[i],heights[st.peek()])-heights[top]
}
