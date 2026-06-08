# Haha Easy!!

- Platform: GeeksforGeeks
- Language: class Solution { public ArrayList<Integer> frequencyCount(int[] arr) { // code here LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(); for ( int num : arr ) { map.put(num,map.getOrDefault(num,0)+1); } return new ArrayList<>(map.values()); } }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Java, Java-Collections
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/frequency-count/1
- Synced: 2026-06-08T12:09:22.426Z

## Problem Description

Given an integer array arr[], you need to find frequency of each element and return in an arraylist in the order they appear. Examples: Input: arr[] = [10, 5, 20, 5, 10, 5] Output: 2 3 1 Explanation: The freq are as follows: 10:2, 5:3, 20:1, so we print the freq in the order of appearance of the elements. We print freq of any element only once. Input: arr[] = [100, 100, 100, 100] Output: 4 Explanation: Here 100 appears 4 times. Constraints: 1 <= arr.length <= 106 0 <= arri <= 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public ArrayList<Integer> frequencyCount(int[] arr) { // code here LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(); for ( int num : arr ) { map.put(num,map.getOrDefault(num,0)+1); } return new ArrayList<>(map.values()); } }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Java, Java-Collections. Review the synced source file for the implementation details.
