# Count Only Once

- Platform: GeeksforGeeks
- Language: public static int countOnce(ArrayList<Integer>arr) { HashSet<Integer> hs=new HashSet<>(arr); int count=0; for(Integer x:hs){ count++; } return count; } // M-2 // HashSet<Integer> hs=new HashSet<>(); // for(int i=0;i<arr.size();i++){ // hs.add(arr.get(i)); // } // return hs.size();
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Java, Java-Collections
- Runtime: . S
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-only-once/1
- Synced: 2026-06-08T12:03:01.314Z

## Problem Description

You are given an integer array arr[] of integers. You need to find how many elements exist if we count the elements only once. That is repeated elements are counted as occuring once. Examples: Input: arr[] = [8, 8, 6, 5, 9, 9, 2] Output: 5 Explanation: Here 8 occurs 2 times, 6 occurs 1 time, 5 occurs 1 time, 9 occurs 2 times, and 2 occurs 1 time. So, if we account each element only once then we have 8 6 5 9 2 only. So the count is 5 here. Input: arr[] = [7, 7, 7, 7, 7, 7, 7, 7, 7, 7] Output: 1 Explanation: Here 7 occurs 10 times. So, if we account each element only once then we have 7 only. So the count is 1 here. Constraints: 1 <= arr.size() <= 103 0 <= arri <= 107

## Explanation

This solution was accepted on GeeksforGeeks using public static int countOnce(ArrayList<Integer>arr) { HashSet<Integer> hs=new HashSet<>(arr); int count=0; for(Integer x:hs){ count++; } return count; } // M-2 // HashSet<Integer> hs=new HashSet<>(); // for(int i=0;i<arr.size();i++){ // hs.add(arr.get(i)); // } // return hs.size();. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Java, Java-Collections. Review the synced source file for the implementation details.
