# Product array puzzle

- Platform: GeeksforGeeks
- Language: class Solution { public static int[] productExceptSelf(int arr[]) { // code here int n = arr.length; int[] ans = new int[n]; ans[0] = 1; for(int i=1; i<n; i++){ ans[i] = ans[i-1] * arr[i-1]; } int suffix = 1; for(int j=n-1; j>=0; j--){ ans[j] *= suffix; suffix *= arr[j]; } return ans; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, D-E-Shaw
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
- Synced: 2026-06-10T18:36:44.932Z

## Problem Description

Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[]. Note: Each element is res[] lies inside the 32-bit integer range. Examples: Input: arr[] = [10, 3, 5, 6, 2] Output: [180, 600, 360, 300, 900] Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180. For i = 1, res[i] = 10 * 5 * 6 * 2 is 600. For i = 2, res[i] = 10 * 3 * 6 * 2 is 360. For i = 3, res[i] = 10 * 3 * 5 * 2 is 300. For i = 4, res[i] = 10 * 3 * 5 * 6 is 900. Input: arr[] = [12, 0] Output: [0, 12] Explanation: For i = 0, res[i] is 0. For i = 1, res[i] is 12. Constraints: 2 <= arr.size() <= 105 -100 <= arr[i] <= 100

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static int[] productExceptSelf(int arr[]) { // code here int n = arr.length; int[] ans = new int[n]; ans[0] = 1; for(int i=1; i<n; i++){ ans[i] = ans[i-1] * arr[i-1]; } int suffix = 1; for(int j=n-1; j>=0; j--){ ans[j] *= suffix; suffix *= arr[j]; } return ans; } }. The detected topics are Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, D-E-Shaw. Review the synced source file for the implementation details.
