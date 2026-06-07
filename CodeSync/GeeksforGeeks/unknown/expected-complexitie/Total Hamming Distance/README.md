# Total Hamming Distance

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags MicrosoftNPCI, Company Tags, Microsoft, NPCI, Topic Tags, Bit Magic, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/bit-manipulation-bonus-problems/problem/total-hamming-distance
- Synced: 2026-06-07T17:50:15.927Z

## Problem Description

Given an integer array arr[], return the sum of Hamming distances between all the pairs of the integers in arr. Note: The answer is guaranteed to fit within a 32-bit integer. Examples: Input: arr[] = [1, 14] Output: 4 Explanation: Binary representations of 1 is 0001, 14 is 1110. The answer will be: HammingDistance(1, 14) = 4. Input: arr[] = [4, 14, 4, 14] Output: 8 Explanation: Binary representations of 4 is 0100, 14 is 1110. The answer will be: HammingDistance(4, 14) + HammingDistance(4, 4) + HammingDistance(4, 14) + HammingDistance(14, 4) + HammingDistance(14, 14) + HammingDistance(4, 14) = 2 + 0 + 2 + 2 + 0 + 2 = 8. Constraints: 2 ≤ arr.size() ≤ 104 1 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags MicrosoftNPCI, Company Tags, Microsoft, NPCI, Topic Tags, Bit Magic, Data Structures. Review the synced source file for the implementation details.
