# First non-repeating character of given string

- Platform: GeeksforGeeks
- Language: #include <bits/stdc++.h> using namespace std; char nonRep(string &s) { int n = s.length(); for (int i = 0; i < n; ++i) { bool found = false; for (int j = 0; j < n; ++j) { if (i != j && s[i] == s[j]) { found = true; break; } } if (!found) return s[i]; } return '$'; } int main() { string s = "racecar"; cout << nonRep(s); return 0; }
- Difficulty: Unknown
- Topics: Amazon, Morgan Stanley, Goldman Sachs, D-E-Shaw, Accolite, Payu, MAQ Software, MakeMyTrip
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/given-a-string-find-its-first-non-repeating-character/
- Synced: 2026-06-13T16:34:21.170Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <bits/stdc++.h> using namespace std; char nonRep(string &s) { int n = s.length(); for (int i = 0; i < n; ++i) { bool found = false; for (int j = 0; j < n; ++j) { if (i != j && s[i] == s[j]) { found = true; break; } } if (!found) return s[i]; } return '$'; } int main() { string s = "racecar"; cout << nonRep(s); return 0; }. The detected topics are Amazon, Morgan Stanley, Goldman Sachs, D-E-Shaw, Accolite, Payu, MAQ Software, MakeMyTrip. Review the synced source file for the implementation details.
