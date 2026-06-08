# CONSISTENCY IS THE KEY...

- Platform: GeeksforGeeks
- Language: class Solution: size = 1 def getSize(self, root): # code here def traverse_tree(root): if root.left: self.size+=1 traverse_tree(root.left) if root.right: self.size+=1 traverse_tree(root.right) return traverse_tree(root) return self.size
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Tree, Data Structures, Related Articles, Write A C Program To Calculate Size Of A Tree
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/size-of-binary-tree/1
- Synced: 2026-06-08T11:56:54.667Z

## Problem Description

Given the root of a binary tree, return the size of the tree. The size of a binary tree is the total number of nodes in the tree. Examples: Input: Output: 3 Explanation: There are 3 nodes in the given binary tree, so its size is 3. Input: Output: 6 Explanation: There are 6 nodes in the given binary tree, so its size is 6. Constraints: 1 ≤ number of nodes ≤ 105 1 ≤ node->data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: size = 1 def getSize(self, root): # code here def traverse_tree(root): if root.left: self.size+=1 traverse_tree(root.left) if root.right: self.size+=1 traverse_tree(root.right) return traverse_tree(root) return self.size. The detected topics are Expected Complexities, Topic Tags, Tree, Data Structures, Related Articles, Write A C Program To Calculate Size Of A Tree. Review the synced source file for the implementation details.
