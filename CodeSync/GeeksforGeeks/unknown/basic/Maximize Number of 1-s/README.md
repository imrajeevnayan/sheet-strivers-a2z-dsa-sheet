# Maximize Number of 1's

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Basic, Expected Complexities, Company Tags AccoliteAmazonMicrosoftMakeMyTrip, Company Tags, Accolite, Amazon, Microsoft, MakeMyTrip
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/array-bonus-problems/problem/maximize-number-of-1s0905
- Synced: 2026-06-13T06:10:03.713Z

## Problem Description

Given a binary array arr[] containing only 0s and 1s and an integer k, you are allowed to flip at most k 0s to 1s. Find the maximum number of consecutive 1's that can be obtained in the array after performing the operation at most k times. Examples: Input: arr[] = [1, 0, 1], k = 1 Output: 3 Explanation: By flipping the zero at index 1, we get the longest subarray from index 0 to 2 containing all 1’s. Input: arr[] = [1, 0, 0, 1, 0, 1, 0, 1], k = 2 Output: 5 Explanation: By flipping the zeroes at indices 4 and 6, we get the longest subarray from index 3 to 7 containing all 1’s. Input: arr[] = [1, 1], k = 2 Output: 2 Explanation: Since the array is already having the max consecutive 1's, hence we dont need to perform any operation. Hence the answer is 2. Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ k ≤ arr.size() 0 ≤ arr[i] ≤ 1

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Basic, Expected Complexities, Company Tags AccoliteAmazonMicrosoftMakeMyTrip, Company Tags, Accolite, Amazon, Microsoft, MakeMyTrip. Review the synced source file for the implementation details.
