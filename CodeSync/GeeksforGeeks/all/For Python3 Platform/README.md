# For Python3 Platform

- Platform: GeeksforGeeks
- Language: ''' class Node: def __init__(self, val): self.right = None self.data = val self.left = None ''' class Solution: def sumBT(self, root): if(root == None): return 0 return root.data + self.sumBT(root.left) + self.sumBT(root.right)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags FactSet, Company Tags, FactSet, Topic Tags, Tree, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1
- Synced: 2026-05-30T18:56:29.489Z

## Problem Description

Given a binary tree, find the sum of values of all the nodes. Examples: Input: root = [15, 10, 20, 8, 12, 16, 25] Output: 106 Explanation: The sum of all the nodes is 15 + 10 + 20 + 8 + 12 + 16 + 25 = 106 . Input: root = [1, 3, 2] Output: 6 Explanation: The sum of all the nodes is 1 + 2 + 3 = 6. Input: root = [1, 2, N, 4, N] Output: 7 Explanation: The sum of all the nodes is 1 + 2 + 4 = 7. Constraints: 1 ≤ number of nodes ≤ 104 -105 ≤ Node data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using ''' class Node: def __init__(self, val): self.right = None self.data = val self.left = None ''' class Solution: def sumBT(self, root): if(root == None): return 0 return root.data + self.sumBT(root.left) + self.sumBT(root.right). The detected topics are Expected Complexities, Company Tags FactSet, Company Tags, FactSet, Topic Tags, Tree, Data Structures, Related Articles. Review the synced source file for the implementation details.
