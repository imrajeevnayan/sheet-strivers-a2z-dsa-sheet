# House Robber

- Platform: GeeksforGeeks
- Language: {...} //Driver Code Starts #include <iostream> #include <vector> using namespace std; //Driver Code Ends // Calculate the maximum stolen value recursively int findMaxSumRec(vector<int> &arr, int n) { // If no houses are left, return 0. if (n <= 0) return 0; // If only 1 house is left, rob it. if (n == 1) return arr[0]; // Two Choices: Rob the nth house and do not rob the nth house int pick = arr[n - 1] + findMaxSumRec(arr, n - 2); int notPick = findMaxSumRec(arr, n - 1); // Return the max of two choices return max(pick, notPick); } // Function to calculate the maximum stolen value int findMaxSum(vector<int>&arr) { int n = arr.size(); // Call the recursive function for n houses return findMaxSumRec(arr, n); } {...} //Driver Code Starts int main() { vector<int> arr = {6, 7, 1, 3, 8, 2, 4}; cout << findMaxSum(arr); return 0; } //Driver Code Ends
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/find-maximum-possible-stolen-value-houses/
- Synced: 2026-05-29T20:10:40.220Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using {...} //Driver Code Starts #include <iostream> #include <vector> using namespace std; //Driver Code Ends // Calculate the maximum stolen value recursively int findMaxSumRec(vector<int> &arr, int n) { // If no houses are left, return 0. if (n <= 0) return 0; // If only 1 house is left, rob it. if (n == 1) return arr[0]; // Two Choices: Rob the nth house and do not rob the nth house int pick = arr[n - 1] + findMaxSumRec(arr, n - 2); int notPick = findMaxSumRec(arr, n - 1); // Return the max of two choices return max(pick, notPick); } // Function to calculate the maximum stolen value int findMaxSum(vector<int>&arr) { int n = arr.size(); // Call the recursive function for n houses return findMaxSumRec(arr, n); } {...} //Driver Code Starts int main() { vector<int> arr = {6, 7, 1, 3, 8, 2, 4}; cout << findMaxSum(arr); return 0; } //Driver Code Ends. Review the synced source file for the implementation details.
