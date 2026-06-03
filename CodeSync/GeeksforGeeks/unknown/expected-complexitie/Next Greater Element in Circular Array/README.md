# Next Greater Element in Circular Array

- Platform: GeeksforGeeks
- Language: public static long[] nextLargerElement(long[] arr, int n) { // Your code here long[] ans = new long[n]; Stack<Long> stack = new Stack<>(); for(int i=n-1;i>=0;i--) { while(stack.size()>0 && stack.peek()<=arr[i]) { stack.pop(); } if(stack.size()==0) { ans[i]=-1; } else { ans[i]=stack.peek(); } stack.push(arr[i]); } return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags FlipkartAmazonMicrosoft, Company Tags, Flipkart, Amazon, Microsoft, Topic Tags, Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/next-greater-element/1
- Synced: 2026-06-03T07:10:55.978Z

## Problem Description

Given a circular integer array arr[], the task is to determine the next greater element (NGE) for each element in the array. The next greater element of an element arr[i] is the first element that is greater than arr[i] when traversing circularly. If no such element exists, return -1 for that position. Note: Since the array is circular, after reaching the last element, the search continues from the beginning until we have looked at all elements once. Examples: Input: arr[] = [1, 3, 2, 4] Output: [3, 4, 4, -1] Explanation: The next greater element for 1 is 3. The next greater element for 3 is 4. The next greater element for 2 is 4. The next greater element for 4 does not exist, so return -1. Input: arr[] = [0, 2, 3, 1, 1] Output: [2, 3, -1, 2, 2] Explanation: The next greater element for 0 is 2. The next greater element for 2 is 3. The next greater element for 3 does not exist, so return -1. The next greater element for 1 is 2 (from circular traversal). The next greater element for 1 is 2 (from circular traversal). Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using public static long[] nextLargerElement(long[] arr, int n) { // Your code here long[] ans = new long[n]; Stack<Long> stack = new Stack<>(); for(int i=n-1;i>=0;i--) { while(stack.size()>0 && stack.peek()<=arr[i]) { stack.pop(); } if(stack.size()==0) { ans[i]=-1; } else { ans[i]=stack.peek(); } stack.push(arr[i]); } return ans; }. The detected topics are Expected Complexities, Company Tags FlipkartAmazonMicrosoft, Company Tags, Flipkart, Amazon, Microsoft, Topic Tags, Stack. Review the synced source file for the implementation details.
