# Operations on Stack

- Platform: GeeksforGeeks
- Language: import java.util.Stack; class Solution { // Function to push an element into the stack. void insert(Stack<Integer> s, int x) { s.push(x); } // Function to remove top element from stack. void remove(Stack<Integer> s) { if (!s.isEmpty()) { s.pop(); } } // Function to print the top element of stack. void headOf_Stack(Stack<Integer> s) { if (!s.isEmpty()) { System.out.println(s.peek()); } else { System.out.println(-1); } } // Function to search an element in the stack. boolean find(Stack<Integer> s, int val) { return s.contains(val); // KEY FIX } }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Stack, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/operations-on-stack/1
- Synced: 2026-05-29T20:28:11.366Z

## Problem Description

Given a stack of integers and Q queries. The task is to perform the operation on stack according to the query. The queries can be of 4 types: i x: (adds element x in the stack). r: (removes the topmost element from the stack). h: Prints the topmost element. f y: (check if the element y is present or not in the stack). Print "Yes" if present, else "No". Examples: Input: Q = 6, queries[][] = [[i, 2], [i, 4], [i, 3],[i, 5], [h], [f, 8]] Output: 5, No Explanation: Inserting 2, 4, 3, and 5 onto the stack. Returning top element which is 5. Finding 8 will give No, as 8 is not in the stack. Input: Q = 4, queries[][] = [[i, 3], [i, 4], [r], [f, 3]] Output: Yes Explanation: Inserting 3 and 4 onto the stack. Removing 4 from the stack. Finding 3 will give Yes as output because 3 is available in the stack. Constraints: 1 ≤ queries.size ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using import java.util.Stack; class Solution { // Function to push an element into the stack. void insert(Stack<Integer> s, int x) { s.push(x); } // Function to remove top element from stack. void remove(Stack<Integer> s) { if (!s.isEmpty()) { s.pop(); } } // Function to print the top element of stack. void headOf_Stack(Stack<Integer> s) { if (!s.isEmpty()) { System.out.println(s.peek()); } else { System.out.println(-1); } } // Function to search an element in the stack. boolean find(Stack<Integer> s, int val) { return s.contains(val); // KEY FIX } }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Stack, Data Structures. Review the synced source file for the implementation details.
