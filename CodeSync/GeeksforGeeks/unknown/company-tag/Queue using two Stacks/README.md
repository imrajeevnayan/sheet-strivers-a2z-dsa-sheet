# Queue using two Stacks

- Platform: GeeksforGeeks
- Language: def Push(x,stack1,stack2): stack1.append(x) return def Pop(stack1,stack2): if not stack2: while stack1: stack2.append(stack1.pop()) if not stack2: return -1 return stack2.pop()
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, D-E-Shaw
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1
- Synced: 2026-06-06T11:39:30.881Z

## Problem Description

Implement a Queue using 2 stacks s1 and s2 . A Query q is of 2 Types (i) 1 x (a query of this type means pushing 'x' into the queue) (ii) 2 (a query of this type means to pop element from queue and print the poped element) Note : If there is no element return -1 as answer while popping. Examples : Input: q=5, queries[][]=[[1, 2], [1, 3], [2], [1, 4], [2]] Output: [2, 3] Explanation: In the first testcase [1 2] the queue will be [2] [1 3] the queue will be [2 3] [2] poped element will be 2 the queue will be [3] [1 4] the queue will be [3 4] [2 ] poped element will be 3. Input: q = 4, queries[][] = [[1, 2], [2], [2], [1, 4]] Output: [2, -1] Explanation: In the second testcase [1, 2] the queue will be [2] [2] poped element will be [2] and then the queue will be empty [2] the queue is empty and hence -1 [1, 4] the queue will be [4]. Constraints: 1 <= q <= 100 1 <= x <= 100

## Explanation

This solution was accepted on GeeksforGeeks using def Push(x,stack1,stack2): stack1.append(x) return def Pop(stack1,stack2): if not stack2: while stack1: stack2.append(stack1.pop()) if not stack2: return -1 return stack2.pop(). The detected topics are Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, D-E-Shaw. Review the synced source file for the implementation details.
