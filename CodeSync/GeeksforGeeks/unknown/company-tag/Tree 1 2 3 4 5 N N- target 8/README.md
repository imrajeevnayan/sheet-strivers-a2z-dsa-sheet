# Tree: 1 2 3 4 5 N N, target: 8

- Platform: GeeksforGeeks
- Language: public: bool solver(Node* root, int t, int sum){ if(!root) return false; sum+=root->data; if(!root->left and !root->right and sum==t) return true; bool left=solver(root->left,t,sum); bool right=solver(root->right,t,sum); return (left or right); } bool hasPathSum(Node *root, int target) { // Your code here return solver(root,target,0); }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Accolite, Amazon, Microsoft, Samsung, FactSet, Housing.com
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/root-to-leaf-path-sum/1
- Synced: 2026-05-30T19:03:42.049Z

## Problem Description

Given a binary tree and an integer target, check whether there is a root-to-leaf path with its sum as target. Examples : Input: target = 2 1 / \ 2 3 Output: false Explanation: There is no root to leaf path with sum 2. Input: target = 4 1 / \ 2 3 Output: true Explanation: The sum of path from leaf node 3 to root 1 is 4. Constraints: 1 ≤ number of nodes ≤ 104 1 ≤ target ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using public: bool solver(Node* root, int t, int sum){ if(!root) return false; sum+=root->data; if(!root->left and !root->right and sum==t) return true; bool left=solver(root->left,t,sum); bool right=solver(root->right,t,sum); return (left or right); } bool hasPathSum(Node *root, int target) { // Your code here return solver(root,target,0); }. The detected topics are Expected Complexities, Company Tags, Accolite, Amazon, Microsoft, Samsung, FactSet, Housing.com. Review the synced source file for the implementation details.
