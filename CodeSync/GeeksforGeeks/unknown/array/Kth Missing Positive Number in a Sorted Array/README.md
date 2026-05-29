# Kth Missing Positive Number in a Sorted Array

- Platform: GeeksforGeeks
- Language: def kthMissing(self, arr, k): # code here missing_count = 0 ind = -1 n = len(arr) low = 0 high = n - 1 if k < (arr[low] - (low + 1)): return k if k > (arr[high] - (high + 1)): return n + k while(low<=high): mid = low + (high - low)//2 missing_count = arr[mid] - (mid+1) if missing_count >= k: ind = mid high = mid - 1 else: low = mid + 1 if ind == 0: return k count1 = arr[ind - 1] - ind count2 = arr[ind] - (ind + 1) ans = arr[ind - 1] + (k - count1) return ans
- Difficulty: Unknown
- Topics: Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/kth-missing-positive-number-in-a-sorted-array/1
- Synced: 2026-05-29T19:20:09.670Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using def kthMissing(self, arr, k): # code here missing_count = 0 ind = -1 n = len(arr) low = 0 high = n - 1 if k < (arr[low] - (low + 1)): return k if k > (arr[high] - (high + 1)): return n + k while(low<=high): mid = low + (high - low)//2 missing_count = arr[mid] - (mid+1) if missing_count >= k: ind = mid high = mid - 1 else: low = mid + 1 if ind == 0: return k count1 = arr[ind - 1] - ind count2 = arr[ind] - (ind + 1) ans = arr[ind - 1] + (k - count1) return ans. The detected topics are Array. Review the synced source file for the implementation details.
