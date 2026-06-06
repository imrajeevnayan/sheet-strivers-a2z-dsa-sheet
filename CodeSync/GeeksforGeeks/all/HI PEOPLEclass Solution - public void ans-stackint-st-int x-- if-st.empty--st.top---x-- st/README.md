# HI PEOPLEclass Solution { public: void ans(stack<int>&st,int x){ if(st.empty()||st.top()<=x){ st.push(x); return; } int temp=st.top(); st.pop(); ans(st,x); st.push(temp); } void sortStack(stack<int> &st) { if(st.empty()){ return; } int x=st.top(); st.pop(); sortStack(st); ans(st,x); }};

- Platform: GeeksforGeeks
- Language: class Solution { public: void sortStack(stack<int> &st) { // code here vector<int> temp; while(!st.empty()){ temp.push_back(st.top()); st.pop(); } vector<int> count(1000+1,0); for(int i:temp)count[i]++; for(int i=0;i<1001;i++){ while(count[i]--) st.push(i); } } };
- Difficulty: Unknown
- Topics: Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sort-a-stack/1
- Synced: 2026-06-06T11:27:48.171Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: void sortStack(stack<int> &st) { // code here vector<int> temp; while(!st.empty()){ temp.push_back(st.top()); st.pop(); } vector<int> count(1000+1,0); for(int i:temp)count[i]++; for(int i=0;i<1001;i++){ while(count[i]--) st.push(i); } } };. The detected topics are Stack. Review the synced source file for the implementation details.
