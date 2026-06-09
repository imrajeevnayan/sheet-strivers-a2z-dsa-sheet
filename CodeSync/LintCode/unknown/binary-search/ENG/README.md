# ENG

- Platform: LintCode
- Language: Java
- Difficulty: Unknown
- Topics: Binary Search, Test Data Test Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/65/
- Synced: 2026-06-09T18:23:10.337Z

## Problem Description

Description There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays.The overall run time complexity should be 𝑂 ( 𝑙 𝑜 𝑔 ( 𝑚 + 𝑛 ) ) O(log(m+n)). LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information The definition of the median: The median here is equivalent to the median in the mathematical definition. The median is the middle of the sorted array. If there are n numbers in the array and n is an odd number, the median is 𝐴 [ ( 𝑛 − 1 ) / 2 ] A[(n−1)/2]. If there are n numbers in the array and n is even, the median is 𝐴 [ ( 𝑛 − 1 ) / 2 ] + 𝐴 [ ( 𝑛 − 1 ) / 2 + 1 ] ) / 2 A[(n−1)/2]+A[(n−1)/2+1])/2. For example, the median of the array A=[1,2,3] is 2, and the median of the array A=[1,19] is 10. Example Example 1: Input: A = [1,2,3,4,5,6] B = [2,3,4,5] Output: 3.5 Explanation: The combined array is [1,2,2,3,3,4,4,5,5,6], and the median is (3 + 4) / 2. Example 2: Input: A = [1,2,3] B = [4,5] Output: 3 Explanation: The combined array is [1,2,3,4,5], and the median is 3. Challenge The overall run time complexity should be 𝑂 ( 𝑙 𝑜 𝑔 ( 𝑚 + 𝑛 ) ) O(log(m+n)). Related Knowledge 学习《2025年1月北美大厂最新面试真题精讲》课程中的1.8Amazon：最新面试精选004相关内容 ，了解更多相关知识！ Tags Related Problems 80 Median Easy 81 Find Median from Data Stream Hard 931 Median of K Sorted Arrays Hard Recommend Courses 简历/BQ/项目 面试软技能指导 FLAG高级工程师深度BQ辅导，简历打造+1V1模拟面试，反面试套路、高效上岸！

## Explanation

This solution was accepted on LintCode using Java. The detected topics are Binary Search, Test Data Test Output. Review the synced source file for the implementation details.
