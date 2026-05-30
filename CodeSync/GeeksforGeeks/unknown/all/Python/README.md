# Python

- Platform: GeeksforGeeks
- Language: class Solution { void helper(Node root, ArrayList<Integer> ans){ if(root == null) return; ans.add(root.data); helper(root.left, ans); helper(root.right, ans); } public ArrayList<Integer> preOrder(Node root) { // code here // preorder - Root Left Right ArrayList<Integer>ans = new ArrayList<>(); helper(root,ans); return ans; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags FlipkartAmazonMicrosoftWalmart, Company Tags, Flipkart, Amazon, Microsoft, Walmart, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/preorder-traversal/1
- Synced: 2026-05-30T16:55:05.766Z

## Problem Description

Given the root of a binary tree, your task is to return its Preorder traversal. Note: A preorder traversal first visits the node, then visits the left child (including its entire subtree), and finally visits the right child (including its entire subtree). Examples: Input: root = [1, 4, N, 4, 2] Output: [1, 4, 4, 2] Explanation: The preorder traversal of the given binary tree is [1, 4, 4, 2] Input: root = [6, 3, 2, N, 1, 2, N] Output: [6, 3, 1, 2, 2] Explanation: The preorder traversal of the given binary tree is [6, 3, 1, 2, 2] Constraints: 1 ≤ number of nodes ≤ 3*104 0 ≤ node->data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { void helper(Node root, ArrayList<Integer> ans){ if(root == null) return; ans.add(root.data); helper(root.left, ans); helper(root.right, ans); } public ArrayList<Integer> preOrder(Node root) { // code here // preorder - Root Left Right ArrayList<Integer>ans = new ArrayList<>(); helper(root,ans); return ans; } }. The detected topics are Expected Complexities, Company Tags FlipkartAmazonMicrosoftWalmart, Company Tags, Flipkart, Amazon, Microsoft, Walmart, Topic Tags. Review the synced source file for the implementation details.
