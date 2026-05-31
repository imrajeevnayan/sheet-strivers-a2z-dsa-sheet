# Maximum Weight Node

- Platform: GeeksforGeeks
- Language: // User function Template for C++ class Solution { public: int maxWeightCell(vector<int> &exits) { int n = exits.size(); vector<int> res(n, 0); for(int i = 0;i<n;i++){ if(exits[i] == -1)continue; res[exits[i]]+=i; } int maxnum = -1; int idx = -1; for(int i = 0;i<n;i++){ if(res[i]>=maxnum){ maxnum = res[i]; idx = i; } } return idx; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags JUSPAY, Company Tags, JUSPAY, Topic Tags, Arrays, Graph, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/maximum-weight-node--170645/1
- Synced: 2026-05-31T12:05:46.823Z

## Problem Description

Given a maze with n cells. Each cell may have multiple entry points but not more than one exit point (i.e entry/exit points are unidirectional doors like valves). You are given an array exits[], where exits[i] contains the exit point of the ith cell. If exits[i] is -1, then ith cell doesn't have an exit. The task is to find the cell with maximum weight (The weight of a cell i is the sum of all the cell indexes that have exit point as i ). If there are multiple cells with the maximum weight return the cell with highest index. Note: The cells are indexed with an integer value from 0 to n-1. A cell i has weight 0 if no cell has exit point as i. Examples: Input: exits[] = [2, 0, -1, 2} Output: 2 Explanation: 1 -> 0 -> 2 <- 3 weight of 0th cell = 1 weight of 1st cell = 0 (because there is no cell pointing to the 1st cell) weight of 2nd cell = 0+3 = 3 weight of 3rd cell = 0 There is only one cell which has maximum weight (i.e 2) So, cell 2 is the output. Input: exits[] = [-1] Output: 0 Explanation: weight of 0th cell is 0. There is only one cell so cell 0 has maximum weight. Constraints: 1 ≤ n ≤ 105 -1 < exits[i] < N exits[i] ≠ i

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for C++ class Solution { public: int maxWeightCell(vector<int> &exits) { int n = exits.size(); vector<int> res(n, 0); for(int i = 0;i<n;i++){ if(exits[i] == -1)continue; res[exits[i]]+=i; } int maxnum = -1; int idx = -1; for(int i = 0;i<n;i++){ if(res[i]>=maxnum){ maxnum = res[i]; idx = i; } } return idx; } };. The detected topics are Expected Complexities, Company Tags JUSPAY, Company Tags, JUSPAY, Topic Tags, Arrays, Graph, Data Structures. Review the synced source file for the implementation details.
