# Elements Appearing More Than n/k Times

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <vector> #include <unordered_map> using namespace std; int countOccurence(vector<int> &arr, int k) { // compute array size and frequency threshold int n = arr.size(); int x = n / k; // store frequency of each element unordered_map<int, int> freq; for (int num : arr) freq[num]++; // count elements whose frequency exceeds n/k int count = 0; for (auto &p : freq) if (p.second > x) count++; // return the final count return count; } int main() { vector<int> arr = {3, 4, 2, 2, 1, 2, 3, 3}; int k = 4; cout << countOccurence(arr, k); return 0; }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/
- Synced: 2026-05-30T17:12:04.608Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <vector> #include <unordered_map> using namespace std; int countOccurence(vector<int> &arr, int k) { // compute array size and frequency threshold int n = arr.size(); int x = n / k; // store frequency of each element unordered_map<int, int> freq; for (int num : arr) freq[num]++; // count elements whose frequency exceeds n/k int count = 0; for (auto &p : freq) if (p.second > x) count++; // return the final count return count; } int main() { vector<int> arr = {3, 4, 2, 2, 1, 2, 3, 3}; int k = 4; cout << countOccurence(arr, k); return 0; }. Review the synced source file for the implementation details.
