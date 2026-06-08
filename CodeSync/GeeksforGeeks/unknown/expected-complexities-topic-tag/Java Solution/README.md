# Java Solution

- Platform: GeeksforGeeks
- Language: class Solution { public static int maximumElement(ArrayList<Integer> arr) { // Your code here int max = Integer.MIN_VALUE; for ( int i : arr ) if ( i > max ) max = i; return max; } public static int minimumElement(ArrayList<Integer> arr) { int min = Integer.MAX_VALUE; for ( int i : arr ) if ( i < min ) min = i; return min; // Your code here } }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Java, Java-Collections
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/max-and-min-in-arraylist/1
- Synced: 2026-06-08T12:11:23.548Z

## Problem Description

Given an integer ArrayList arr[], find maximum and minimum elements in the ArrayList. Examples: Input: arr[] = [5, 4, 2, 1] Output: 5 1 Explanation: Maximum element is: 5. Minimum element is: 1 Input: arr[] = [8] Output: 8 8 Explanation: Maximum element is: 8. Minimum element is: 8 Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arri ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static int maximumElement(ArrayList<Integer> arr) { // Your code here int max = Integer.MIN_VALUE; for ( int i : arr ) if ( i > max ) max = i; return max; } public static int minimumElement(ArrayList<Integer> arr) { int min = Integer.MAX_VALUE; for ( int i : arr ) if ( i < min ) min = i; return min; // Your code here } }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Java, Java-Collections. Review the synced source file for the implementation details.
