# Reverse a Stack

- Platform: GeeksforGeeks
- Language: class Solution{ public: queue<int>ans; void Reverse(stack<int> &St){ if (!St.empty()){ ans.push(St.top()); St.pop(); } else{ return; } Reverse(St); while (!ans.empty()){ St.push(ans.front()); ans.pop(); } } };
- Difficulty: Unknown
- Topics: Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-a-stack/1
- Synced: 2026-05-30T19:29:53.194Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution{ public: queue<int>ans; void Reverse(stack<int> &St){ if (!St.empty()){ ans.push(St.top()); St.pop(); } else{ return; } Reverse(St); while (!ans.empty()){ St.push(ans.front()); ans.pop(); } } };. The detected topics are Stack. Review the synced source file for the implementation details.
