# Best C++ Solution

- Platform: GeeksforGeeks
- Language: class Solution { int countNonLeafNodes(Node root) { // code here if(root == null){ return 0; } if(root.left == null && root.right == null){ return 0; } return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right); } }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1
- Synced: 2026-05-30T16:57:29.776Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int countNonLeafNodes(Node root) { // code here if(root == null){ return 0; } if(root.left == null && root.right == null){ return 0; } return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right); } }. Review the synced source file for the implementation details.
