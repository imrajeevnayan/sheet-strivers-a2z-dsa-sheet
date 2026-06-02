# Platform: LintCode
# Problem: Course
# URL: https://www.lintcode.com/problem/363/description
# Language: Python
# Difficulty: Unknown
# Topics: Opposite Direction Two Pointers, Stack, Two Pointers, Monotonic Stack, Apple, Twitter, Airbnb, Amazon
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-02T07:14:26.985Z

public·class·Solution·{
····public·int·trapRainWater(int[]·height)·{
········if·(height·==·null·||·height.length·==·0)·return·0;
····
····int·left·=·0,·right·=·height.length·-·1;
····int·leftMax·=·0,·rightMax·=·0;
····int·water·=·0;
····
····while·(left·<·right)·{
········if·(height[left]·<·height[right])·{
············if·(height[left]·>=·leftMax)·{
················leftMax·=·height[left];
············}·else·{
················water·+=·leftMax·-·height[left];
············}
