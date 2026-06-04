# ENG

- Platform: LintCode
- Language: Python
- Difficulty: Unknown
- Topics: StackMonotonic Stack, Stack, Monotonic Stack, Microsoft, Test Data Test Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/1740/
- Synced: 2026-06-04T11:33:27.156Z

## Problem Description

Description Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's price for the current day. The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price. For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6]. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information Calls to StockSpanner.next(int price) will have 1 <= price <= 10^5. There will be at most 10000 calls to StockSpanner.next per test case. There will be at most 150000 calls to StockSpanner.next across all test cases. The total time limit for this problem has been reduced by 75% for C++, and 50% for all other languages. Example Example 1: Input: prices = [100,80,60,70,60,75,85] Output: [1,1,1,2,1,4,6] Explanation: First, S = StockSpanner() is initialized. Then: S.next(100) is called and returns 1, S.next(80) is called and returns 1, S.next(60) is called and returns 1, S.next(70) is called and returns 2, S.next(60) is called and returns 1, S.next(75) is called and returns 4, S.next(85) is called and returns 6. Note that (for example) S.next(75) returned 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price. Example 2: Input: prices = [50,80,80,70,90,75,85] Output: [1,2,3,1,5,1,2] Explanation: ： First, S = StockSpanner() is initialized. Then: S.next(50) is called and returns 1, S.next(80) is called and returns 3 S.next(70) is called and returns 1 S.next(90) is called and returns 5 S.next(75) is called and returns 1 S.next(85) is called and returns 2 Related Knowledge 学习《算法——双指针思想》课程中的3.15单调堆栈练习2相关内容 ，了解更多相关知识！ Tags Company Microsoft Recommend Courses 0基础入门数据分析 进阶大厂刚需高薪人才，熟练掌握SQL、Python、Tableau、A/Btest等实用技能工具，配套100+数据题夯实基础

## Explanation

This solution was accepted on LintCode using Python. The detected topics are StackMonotonic Stack, Stack, Monotonic Stack, Microsoft, Test Data Test Output. Review the synced source file for the implementation details.
