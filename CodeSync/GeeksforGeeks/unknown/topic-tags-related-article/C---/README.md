# C++✅

- Platform: GeeksforGeeks
- Language: Node *nextRight(Node *root, int key) { //code here queue<Node*> q; q.push(root); while(!q.empty()) { int s=q.size(); for(int i=0;i<s;i++) { Node*curr=q.front(); q.pop(); // NO NODE ON RIGHT SIDE if(curr->data==key && i==s-1) { Node*newnode=new Node(-1); return newnode; } // THERE IS A NODE ON RIGHT SIDE // THE NEXT ELEMENT IN THE QUEUE if(curr->data==key) { Node*curr2=q.front(); q.pop(); return curr2; } if(curr->left){ q.push(curr->left); } if(curr->right) { q.push(curr->right); } } } }
- Difficulty: Unknown
- Topics: Topic Tags Related Articles, Topic Tags, Traversal, Queue, Tree, Data Structures, Algorithms, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/next-right-node/1
- Synced: 2026-05-30T18:59:53.381Z

## Problem Description

Given a Binary tree and a key in the binary tree, find the node right to the given key. If there is no node on right side, then return a node with value -1. Examples: Input: root = [10 2 6 8 4 N 5] and key = 2 Output: 6 Explanation: We can see in the above tree that the next right node of 2 is 6. Input: root = [10 2 6 8 4 N 5] and key = 5 Output: -1 Explanation: We can see in the above tree that there's No next right node of 5. So, the output is -1. Your Task: You don't need to read input or print anything. Your task is to complete the function nextRight() which takes root node of the tree and an integer key as input parameters and returns the next right node of the node with value key. Expected Time Complexity: O(N) Expected Auxiliary Space: O(N) Constraints: 1<=N<=103 1<=data of node<=103 1<=key<=103

## Explanation

This solution was accepted on GeeksforGeeks using Node *nextRight(Node *root, int key) { //code here queue<Node*> q; q.push(root); while(!q.empty()) { int s=q.size(); for(int i=0;i<s;i++) { Node*curr=q.front(); q.pop(); // NO NODE ON RIGHT SIDE if(curr->data==key && i==s-1) { Node*newnode=new Node(-1); return newnode; } // THERE IS A NODE ON RIGHT SIDE // THE NEXT ELEMENT IN THE QUEUE if(curr->data==key) { Node*curr2=q.front(); q.pop(); return curr2; } if(curr->left){ q.push(curr->left); } if(curr->right) { q.push(curr->right); } } } }. The detected topics are Topic Tags Related Articles, Topic Tags, Traversal, Queue, Tree, Data Structures, Algorithms, Related Articles. Review the synced source file for the implementation details.
