# C++ Solution || Easy Approach and Step by Step Explanation

- Platform: GeeksforGeeks
- Language: class Solution { public: int bs(vector<int>&a , int k){ int st = 0 ,en = a.size()-1; while(st<=en){ int mid = (st + en)/2; if(a[mid] == k)return mid+1; if(a[mid] <k)st = mid+1; else en = mid-1; } return st; } vector<int> freqInRange(vector<int>& arr, vector<vector<int>>& queries) { // code here unordered_map< int, vector<int>>adj; for(int i = 0 ;i< arr.size() ; i++){ adj[arr[i]].push_back(i); } vector<int>ans; for(auto &i: queries){ if(adj.find(i[2]) == adj.end()){ ans.push_back(0); continue; } int count = bs(adj[i[2]] , i[1]); // cout<<count<<endl; count-=bs(adj[i[2]] , i[0]-1); ans.push_back(count); } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Binary Search, Map, Data Structures, Algorithms, Related Articles, Count Frequency Of An Element In A Given Range
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-frequency-of-an-element-in-a-given-range/1
- Synced: 2026-06-03T06:51:11.706Z

## Problem Description

Given an array arr[] of n integers and a 2D array queries[][] representing q queries, where each queries[i] consists of three integers: l, r, and x. For each query determine how many times the element x appears in the arr[] from index l to r (both inclusive). Return a list of integers where the i-th value represents the answer to the i-th query. Examples: Input: arr[] = [1, 2, 1, 3, 1, 2, 3], queries[][] = [[0, 4, 1], [2, 5, 2], [1, 6, 3], [0, 6, 5]] Output: [3, 1, 2, 0] Explanation: query [0, 4, 1] -> Subarray = [1, 2, 1, 3, 1], 1 appears 3 times query [2, 5, 2] -> Subarray = [1, 3, 1, 2], 2 appears 1 time query [1, 6, 3] -> Subarray = [2, 1, 3, 1, 2, 3] 3 appears 2 times query [0, 6, 5] -> Subarray = [1, 2, 1, 3, 1, 2, 3], 5 appears 0 times Input: arr[] = [11, 21, 51, 101, 11, 51], queries[][] = [[0, 4, 11], [2, 5, 51]] Output: [2, 2] Explanation: query [0, 4, 11] -> Subarray = [11, 21, 51, 101, 11], 11 appears 2 times query [2, 5, 51] -> Subarray = [51, 101, 11, 51], 51 appears 2 times Constraints: 1 ≤ arr.size(), queries.size() ≤ 105 1 ≤ arr[i], queries[i][2] ≤ 105 0 ≤ queries[i][0] ≤ queries[i][1] < arr.size()

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int bs(vector<int>&a , int k){ int st = 0 ,en = a.size()-1; while(st<=en){ int mid = (st + en)/2; if(a[mid] == k)return mid+1; if(a[mid] <k)st = mid+1; else en = mid-1; } return st; } vector<int> freqInRange(vector<int>& arr, vector<vector<int>>& queries) { // code here unordered_map< int, vector<int>>adj; for(int i = 0 ;i< arr.size() ; i++){ adj[arr[i]].push_back(i); } vector<int>ans; for(auto &i: queries){ if(adj.find(i[2]) == adj.end()){ ans.push_back(0); continue; } int count = bs(adj[i[2]] , i[1]); // cout<<count<<endl; count-=bs(adj[i[2]] , i[0]-1); ans.push_back(count); } return ans; } };. The detected topics are Expected Complexities, Topic Tags, Binary Search, Map, Data Structures, Algorithms, Related Articles, Count Frequency Of An Element In A Given Range. Review the synced source file for the implementation details.
