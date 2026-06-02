# Platform: LintCode
# Problem: Course
# URL: https://www.lintcode.com/problem/363/description
# Language: Python
# Difficulty: Hard
# Topics: Opposite Direction Two Pointers, Stack, Two Pointers, Monotonic Stack, Apple, Twitter, Airbnb, Amazon
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-02T08:04:47.298Z

················water·+=·leftMax·-·height[left];
············}
············left++;
········}·else·{
············if·(height[right]·>=·rightMax)·{
················rightMax·=·height[right];
············}·else·{
················water·+=·rightMax·-·height[right];
············}
············right--;
········}
····}
············}·else·{
················leftMax·=·height[left];
············if·(height[left]·>=·leftMax)·{
········if·(height[left]·<·height[right])·{
····while·(left·<·right)·{
····
····int·water·=·0;
····int·leftMax·=·0,·rightMax·=·0;
····int·left·=·0,·right·=·height.length·-·1;
····
········if·(height·==·null·||·height.length·==·0)·return·0;
public·class·Solution·{
····public·int·trapRainWater(int[]·height)·{
