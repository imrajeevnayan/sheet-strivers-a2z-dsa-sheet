# Rotate Deque By K

- Platform: GeeksforGeeks
- Language: def rotateDeque(self, dq, tp, k): #code here k=k%len(dq) if tp==1: while k: dq.appendleft(dq.pop()) k-=1 else: while k: dq.append(dq.popleft()) k-=1 return dq
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, Data Structures, Deque
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/rotate-deque-by-k/1
- Synced: 2026-06-08T12:14:25.625Z

## Problem Description

You are given a deque dq (double-ended queue) containing non-negative integers, along with two positive integer type and k. The task is to rotate the deque circularly by k positions. There are two types of rotation operations: Right Rotation (Clockwise): If type = 1, rotate the deque to the right. This means moving the last element to the front, and repeating the process k times. Left Rotation (Anti-Clockwise): If type = 2, rotate the deque to the left. This means moving the first element to the back, and repeating the process k times. Examples: Input: dq = [1, 2, 3, 4, 5, 6], type = 1, k = 2 Output: [5, 6, 1, 2, 3, 4] Explanation: The type is 1 and k is 2. So, we need to right rotate dequeue by 2 times. In first right rotation we get [6, 1, 2, 3, 4, 5]. In second right rotation we get [5, 6, 1, 2, 3, 4]. Input: dq = [10, 20, 30, 40, 50], type = 2, k = 3 Output: [40, 50, 10, 20, 30] Explanation: The type is 2 and k is 3. So, we need to left rotate dequeue by 3 times. In first left rotation we get [20, 30, 40, 50, 10]. In second left rotation we get [30, 40, 50, 10, 20]. In third left rotation we get [40, 50, 10, 20, 30]. Constraints: 1 ≤ dq.size() ≤ 105 1 ≤ k ≤ 105 1 ≤ type ≤ 2

## Explanation

This solution was accepted on GeeksforGeeks using def rotateDeque(self, dq, tp, k): #code here k=k%len(dq) if tp==1: while k: dq.appendleft(dq.pop()) k-=1 else: while k: dq.append(dq.popleft()) k-=1 return dq. The detected topics are Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, Data Structures, Deque. Review the synced source file for the implementation details.
