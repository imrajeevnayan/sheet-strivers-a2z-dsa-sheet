# Lucky Numbers

- Platform: GeeksforGeeks
- Language: class Solution { // Complete the function // n: Input n // Return True if the given number is a lucky number else return False static boolean solve( int num , int div ) { if( num%div == 0 ) return false; if( num%div == num ) return true; int quo = num/div; int rem = num%div; int res = (quo*div)+(rem - quo); return solve( res , div+1 ); } public static boolean isLucky(int n) { // Your code here return solve( n , 2 ); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Mathematical, Recursion, Algorithms
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/lucky-numbers2911/1
- Synced: 2026-06-03T20:15:41.076Z

## Problem Description

A lucky number is defined using a special elimination process: 1. Start with natural numbers: 1, 2, 3, 4, 5, 6, ... 2. In the 1st step, remove every 2nd number. 3. In the 2nd step, remove every 3rd remaining number. 4. In the 3rd step, remove every 4th remaining number, and so on... This continues indefinitely. Given an integer n, determine if it remains after all steps. Return 1 if n is a lucky number, otherwise return 0. Examples : Input: n = 5 Output: 0 Explanation: 5 is not a lucky number as it gets deleted in the second iteration. Input: n = 19 Output: 1 Explanation: 19 is a lucky number because it does not get deleted throughout the process. Constraints: 1 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { // Complete the function // n: Input n // Return True if the given number is a lucky number else return False static boolean solve( int num , int div ) { if( num%div == 0 ) return false; if( num%div == num ) return true; int quo = num/div; int rem = num%div; int res = (quo*div)+(rem - quo); return solve( res , div+1 ); } public static boolean isLucky(int n) { // Your code here return solve( n , 2 ); } }. The detected topics are Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Mathematical, Recursion, Algorithms. Review the synced source file for the implementation details.
