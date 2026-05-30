# EASY AND SIMPLE CPP SOLUTION USING LEVEL ORDER TRAVERSING

- Platform: GeeksforGeeks
- Language: class Solution{ public: int sum=0; void traversal(Node* root){ if(!root) return; if((root->right) && (root->right->left==NULL) && (root->right->right==NULL)){ sum+=root->right->data; } traversal(root->left); traversal(root->right); } int rightLeafSum(Node* root) { traversal(root); return sum; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Traversal, Tree, Data Structures, Algorithms, Related Articles, Find Sum Right Leaves Given Binary Tree
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-right-leaf-nodes/1
- Synced: 2026-05-30T19:06:01.639Z

## Problem Description

Given the root of a Binary Tree, return the sum of all right leaf nodes. A right leaf node is a node that is the right child of its parent and does not have any left or right child. Examples: Input: root[] = [1, 2, 3, 4, 5, N, 8, N, 2, N, N, 6, 7] Output : 14 Explanation: All the right leaf nodes presents are 2, 5 and 7 which sums up to 14. Input: root[] = [1, -2, 3, N, 5, N, 8] Output: 13 Explanation: All the right leaf nodes presents are 5 and 8 which sums up to 13. Constraints: 1 ≤ number of nodes ≤ 106 1 ≤ node->data ≤ 105 It is guaranteed that sum will not exceed integer max value

## Explanation

This solution was accepted on GeeksforGeeks using class Solution{ public: int sum=0; void traversal(Node* root){ if(!root) return; if((root->right) && (root->right->left==NULL) && (root->right->right==NULL)){ sum+=root->right->data; } traversal(root->left); traversal(root->right); } int rightLeafSum(Node* root) { traversal(root); return sum; } };. The detected topics are Expected Complexities, Topic Tags, Traversal, Tree, Data Structures, Algorithms, Related Articles, Find Sum Right Leaves Given Binary Tree. Review the synced source file for the implementation details.
