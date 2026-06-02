# Easy C++ Solution

- Platform: GeeksforGeeks
- Language: class Solution { public: stack<int> insertAtBottom(stack<int> st, int x) { aadarsh(st,x); return st; } void aadarsh(stack<int> &st, int x) { if(st.empty()){ st.push(x); return; } int ans=st.top(); st.pop(); aadarsh(st,x); st.push(ans); } };
- Difficulty: Unknown
- Topics: Topic Tags Related Articles, Topic Tags, Recursion, Stack, implementation, Data Structures, Algorithms, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1
- Synced: 2026-06-02T18:39:54.879Z

## Problem Description

You are given a stack st of n integers and an element x. You have to insert x at the bottom of the given stack. Note: Everywhere in this problem, the bottommost element of the stack is shown first while priniting the stack. Example 1: Input: n = 5 x = 2 st = {4,3,2,1,8} Output: {2,4,3,2,1,8} Explanation: After insertion of 2, the final stack will be {2,4,3,2,1,8}. Example 2: Input: n = 3 x = 4 st = {5,3,1} Output: {4,5,3,1} Explanation: After insertion of 4, the final stack will be {4,5,3,1}. Your Task: You don't need to read input or print anything. Your task is to complete the function insertAtBottom() which takes a stack st and an integer x as inputs and returns the modified stack after insertion. Expected Time Complexity: O(n) Expected Auxiliary Space: O(n) Constraints: 1 <= n <= 105 0 <= x, elements of stack <= 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: stack<int> insertAtBottom(stack<int> st, int x) { aadarsh(st,x); return st; } void aadarsh(stack<int> &st, int x) { if(st.empty()){ st.push(x); return; } int ans=st.top(); st.pop(); aadarsh(st,x); st.push(ans); } };. The detected topics are Topic Tags Related Articles, Topic Tags, Recursion, Stack, implementation, Data Structures, Algorithms, Related Articles. Review the synced source file for the implementation details.
