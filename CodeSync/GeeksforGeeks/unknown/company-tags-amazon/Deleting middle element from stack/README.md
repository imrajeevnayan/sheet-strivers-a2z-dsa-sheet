# Deleting middle element from stack

- Platform: GeeksforGeeks
- Language: #include <bits/stdc++.h> using namespace std; void deleteMid(stack<int> &st ,int N){ int popped_elements = N-st.size(); if(popped_elements == (N/2)){ st.pop(); return; } int x=st.top(); st.pop(); deleteMid(st,N); st.push(x); } void deleteMidElement(stack<int>& st) { int N = st.size(); deleteMid(st,N); } int main() { stack<int> st; st.push(6); st.push(5); st.push(4); st.push(3); st.push(2); st.push(1); deleteMidElement(st); while (!st.empty()) { cout << st.top() << " "; st.pop(); } return 0; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Recursion, Stack, STL
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
- Synced: 2026-06-06T11:33:36.042Z

## Problem Description

Given a stack s, delete the middle element of the stack without using any additional data structure. Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from the bottom of the stack. Note: The output shown by the compiler is the stack from top to bottom. Examples: Input: s = [10, 20, 30, 40, 50] Output: [50, 40, 20, 10] Explanation: The bottom-most element will be 10 and the top-most element will be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30, stack will look like {10 20 40 50}. Input: s = [10, 20, 30, 40] Output: [40, 30, 10] Explanation: The bottom-most element will be 10 and the top-most element will be 40. Middle element will be element at index 2 from bottom, which is 20. Deleting 20, stack will look like {10 30 40}. Input: s = [5, 8, 6, 7, 6, 6, 5, 10, 12, 9] Output: [9, 12, 10, 5, 6, 7, 6, 8, 5] Constraints: 2 ≤ element of stack ≤ 105 2 ≤ s.size() ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using #include <bits/stdc++.h> using namespace std; void deleteMid(stack<int> &st ,int N){ int popped_elements = N-st.size(); if(popped_elements == (N/2)){ st.pop(); return; } int x=st.top(); st.pop(); deleteMid(st,N); st.push(x); } void deleteMidElement(stack<int>& st) { int N = st.size(); deleteMid(st,N); } int main() { stack<int> st; st.push(6); st.push(5); st.push(4); st.push(3); st.push(2); st.push(1); deleteMidElement(st); while (!st.empty()) { cout << st.top() << " "; st.pop(); } return 0; }. The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Recursion, Stack, STL. Review the synced source file for the implementation details.
