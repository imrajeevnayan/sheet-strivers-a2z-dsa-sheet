# easy to understand soln in c++...

- Platform: GeeksforGeeks
- Language: int peakElement(vector<int> &arr) { // code here if(arr.size()<=1) return 0; //check for for(int i=0;i<arr.size()-1;i++) { if(i==0) { if(arr[i]>arr[i+1]) return i; } else if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return i; } //check for 1 ele //if(arr.size()>=2) if(arr[0]>arr[1]) return true; if(arr[arr.size()-1] > arr[arr.size()-2]) return arr.size()-1; return -1; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AccoliteAmazonVisaAdobeGoogle, Company Tags, Accolite, Amazon, Visa, Adobe, Google
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/peak-element/1
- Synced: 2026-05-29T10:49:38.209Z

## Problem Description

You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false". Note: Consider the element before the first element and the element after the last element to be negative infinity. Examples : Input: arr = [1, 2, 4, 5, 7, 8, 3] Output: true Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6]. Input: arr = [10, 20, 15, 2, 23, 90, 80] Output: true Explanation: Element 20 at index 1 is a peak since 10 < 20 > 15. Index 5 (value 90) is also a peak, but returning any one peak index is valid. Constraints: 1 ≤ arr.size() ≤ 106 -231 ≤ arr[i] ≤ 231 - 1

## Explanation

This solution was accepted on GeeksforGeeks using int peakElement(vector<int> &arr) { // code here if(arr.size()<=1) return 0; //check for for(int i=0;i<arr.size()-1;i++) { if(i==0) { if(arr[i]>arr[i+1]) return i; } else if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return i; } //check for 1 ele //if(arr.size()>=2) if(arr[0]>arr[1]) return true; if(arr[arr.size()-1] > arr[arr.size()-2]) return arr.size()-1; return -1; }. The detected topics are Expected Complexities, Company Tags AccoliteAmazonVisaAdobeGoogle, Company Tags, Accolite, Amazon, Visa, Adobe, Google. Review the synced source file for the implementation details.
