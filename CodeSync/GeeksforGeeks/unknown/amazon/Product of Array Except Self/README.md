# Product of Array Except Self

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <vector> using namespace std; vector<int> productExceptSelf(vector<int>& arr) { int n = arr.size(); // Fill result array with 1 vector<int> res(n, 1); for (int i = 0; i < n; i++) { // Compute product of all elements except arr[i] for (int j = 0; j < n; j++) { if (i != j) res[i] *= arr[j]; } } return res; } int main() { vector<int> arr = {10, 3, 5, 6, 2}; vector<int> res = productExceptSelf(arr); for (int val : res) cout << val << " "; return 0; }
- Difficulty: Unknown
- Topics: Amazon, Morgan Stanley, D-E-Shaw, Accolite, Opera, prefix-sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/a-product-array-puzzle/
- Synced: 2026-06-10T18:36:20.104Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <vector> using namespace std; vector<int> productExceptSelf(vector<int>& arr) { int n = arr.size(); // Fill result array with 1 vector<int> res(n, 1); for (int i = 0; i < n; i++) { // Compute product of all elements except arr[i] for (int j = 0; j < n; j++) { if (i != j) res[i] *= arr[j]; } } return res; } int main() { vector<int> arr = {10, 3, 5, 6, 2}; vector<int> res = productExceptSelf(arr); for (int val : res) cout << val << " "; return 0; }. The detected topics are Amazon, Morgan Stanley, D-E-Shaw, Accolite, Opera, prefix-sum. Review the synced source file for the implementation details.
