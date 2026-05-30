# JAVA EASY SOLUTION

- Platform: GeeksforGeeks
- Language: class Solution { public static int digitalRoot(int n) { // code here if(n<10){ return n; } int sum=s(n); return digitalRoot(sum); } public static int s(int n){ if(n==0){ return 0; } return (n%10) + s(n/10); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Accolite, Facebook, FiberLink, Adobe, FactSet, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/digital-root/1
- Synced: 2026-05-30T19:26:06.013Z

## Problem Description

You are given a number n. You need to find the digital root of n. Digital Root of a number is the recursive sum of its digits until we get a single digit number. Examples : Input: n = 1 Output: 1 Explanation: Digital root of 1 is 1 Input: n = 99999 Output: 9 Explanation: Sum of digits of 99999 is 45 which is not a single digit number, hence sum of digit of 45 is 9 which is a single digit number. Constraints: 1 ≤ n ≤ 107

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static int digitalRoot(int n) { // code here if(n<10){ return n; } int sum=s(n); return digitalRoot(sum); } public static int s(int n){ if(n==0){ return 0; } return (n%10) + s(n/10); } }. The detected topics are Expected Complexities, Company Tags, Accolite, Facebook, FiberLink, Adobe, FactSet, Topic Tags. Review the synced source file for the implementation details.
