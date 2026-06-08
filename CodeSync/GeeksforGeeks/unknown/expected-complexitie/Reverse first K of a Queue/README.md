# Reverse first K of a Queue

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Stack, Queue, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
- Synced: 2026-06-08T10:04:26.900Z

## Problem Description

Given an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order. Only following standard operations are allowed on queue. enqueue(x) : Add an item x to rear of queue dequeue() : Remove an item from front of queue size() : Returns number of elements in queue. front() : Finds front item. Note: The above operations represent the general processings. In-built functions of the respective languages can be used to solve the problem. "If the size of queue is smaller than the given k , then return the original queue." Examples: Input: q = [1, 2, 3, 4, 5], k = 3 Output: [3, 2, 1, 4, 5] Explanation: After reversing the first 3 elements from the given queue the resultant queue will be 3 2 1 4 5 Input: q = [4, 3, 2, 1], k = 4 Output: [1, 2, 3, 4] Explanation: After reversing the first 4 elements from the given queue the resultant queue will be 1 2 3 4 Constraints: 1<=q[i]<=105 1<=q.size()<=105 1<=k<=105

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Stack, Queue, Data Structures. Review the synced source file for the implementation details.
