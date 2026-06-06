# URL Shortner System Design

- Platform: GeeksforGeeks
- Language: #include <string> #include <vector> std::string to_base_62(int deci) { std::string s = "012345689abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; std::string hash_str = ""; while (deci > 0) { hash_str = s[deci % 62] + hash_str; deci /= 62; } return hash_str; }
- Difficulty: Unknown
- Topics: System-Design, GBlog 2024, GBlog 2025
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/system-design/system-design-url-shortening-service/
- Synced: 2026-06-06T10:36:16.461Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <string> #include <vector> std::string to_base_62(int deci) { std::string s = "012345689abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; std::string hash_str = ""; while (deci > 0) { hash_str = s[deci % 62] + hash_str; deci /= 62; } return hash_str; }. The detected topics are System-Design, GBlog 2024, GBlog 2025. Review the synced source file for the implementation details.
