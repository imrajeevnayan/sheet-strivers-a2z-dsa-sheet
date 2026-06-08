# Java Code

- Platform: GeeksforGeeks
- Language: //Back-end complete function Template for Java class Solution { public static void freqSorted(int arr[]) { // Your Code Here HashMap<Integer,Integer> map = new HashMap<>(); for ( int i : arr ) { map.put(i,map.getOrDefault(i,0)+1); } for ( int num : map.keySet() ) { System.out.println(num+" "+map.get(num)); } } }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Java, STL, Java-Collections
- Runtime: . S
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sorted-frequency/1
- Synced: 2026-06-08T12:18:51.043Z

## Problem Description

You are given an integer array arr[]. You need to print the distinct elements of array in sorted order(increasing) together with their frequency. Note: Print each element in a new line. Example: Input: arr[] = [3, 3, 2, 2, 1, 4] Output: 1 1 2 2 3 2 4 1 Explanation: 3 appears 2 times. 2 appears 2 times. 1 appears 1 time, and 4 appears 1 time. So in sorted order we write elements and their frequencies. Constraints: 1 ≤ arr.size() ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using //Back-end complete function Template for Java class Solution { public static void freqSorted(int arr[]) { // Your Code Here HashMap<Integer,Integer> map = new HashMap<>(); for ( int i : arr ) { map.put(i,map.getOrDefault(i,0)+1); } for ( int num : map.keySet() ) { System.out.println(num+" "+map.get(num)); } } }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Java, STL, Java-Collections. Review the synced source file for the implementation details.
