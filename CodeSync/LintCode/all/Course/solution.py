# Platform: LintCode
# Problem: Course
# URL: https://www.lintcode.com/problem/363/description
# Language: Python
# Difficulty: Hard
# Topics: Opposite Direction Two Pointers, Stack, Two Pointers, Monotonic Stack, Apple, Twitter, Airbnb, Amazon
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-02T07:57:13.816Z

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
····return·water;
····}
}
