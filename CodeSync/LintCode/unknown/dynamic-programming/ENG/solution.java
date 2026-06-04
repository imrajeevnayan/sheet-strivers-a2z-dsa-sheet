/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/392/?showListFe=false&page=1&problemTypeId=4&pageSize=50
 * Language: Java
 * Difficulty: Unknown
 * Topics: Dynamic Programming, DPCoordinate DP, DP, Coordinate DP, LinkedIn Airbnb, LinkedIn, Airbnb, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-04T06:48:56.070Z
 */

public·class·Solution·{
····public·long·houseRobber(int[]·a)·{
········if·(a·==·null·||·a.length·==·0)·return·0;
········if·(a.length·==·1)·return·a[0];
········
········int·n·=·a.length;
········
········long·prev2·=·0;
········long·prev1·=·0;
········
········for·(int·i·=·0;·i·<·n;·i++)·{
············//·Either·skip·current·house·(prev1)·or·rob·it·(prev2·+·a[i])
············long·curr·=·Math.max(prev1,·prev2·+·a[i]);
············
············//·Shift·variables·forward
············prev2·=·prev1;
············prev1·=·curr;
········}
········
········return·prev1;
····}
}
