# class Solution { public: int subarrayXor(vector<int>& arr) { int ans = 0 , n = arr.size(); for(int i = 1; i <= n; i++){ int x = i , y = n - i + 1; int num = arr[i - 1]; if((x & 1) + (y & 1) == 2) ans ^= num; } return ans; }};

- Platform: GeeksforGeeks
- Language: class Solution { public int subarrayXor(int[] arr) { int n=arr.length; int xor=0; for(int i=0;i<n;i++){ int freq=(((i-0)*(n-i))+(n-i)); if(freq%2!=0) xor^=arr[i]; } return xor; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonNPCI, Company Tags, Amazon, NPCI, Topic Tags, Mathematical, Bit Magic
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/game-of-xor1541/1
- Synced: 2026-06-03T16:41:07.131Z

## Problem Description

You are given an integer array arr[]. The value of a subarray is defined as the bitwise XOR of all elements in that subarray. Your task is to compute the bitwise XOR of the values of all possible subarrays of arr[]. Examples: Input: arr[] = [1, 2, 3] Output: 2 Explanation: xor[1] = 1 xor[1, 2] = 3 xor[2, 3] = 1 xor[1, 2, 3] = 0 xor[2] = 2 xor[3] = 3 Result : 1 ^ 3 ^ 1 ^ 0 ^ 2 ^ 3 = 2 Input: arr[] = [1, 2] Output: 0 Explanation: xor[1] = 1 xor[1, 2] = 3 xor[2] = 2 Result : 1 ^ 3 ^ 2 = 0 Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int subarrayXor(int[] arr) { int n=arr.length; int xor=0; for(int i=0;i<n;i++){ int freq=(((i-0)*(n-i))+(n-i)); if(freq%2!=0) xor^=arr[i]; } return xor; } }. The detected topics are Expected Complexities, Company Tags AmazonNPCI, Company Tags, Amazon, NPCI, Topic Tags, Mathematical, Bit Magic. Review the synced source file for the implementation details.
