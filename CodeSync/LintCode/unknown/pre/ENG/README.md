# ENG

- Platform: LintCode
- Language: Java
- Difficulty: Unknown
- Topics: PRE, please contact us via "Problem Correction", StackString, Stack, String, Test Data Test Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/2506
- Synced: 2026-06-03T08:36:35.511Z

## Problem Description

This topic is a pre-release topic. If you encounter any problems, please contact us via "Problem Correction", and we will upgrade your account to VIP as a thank you. Description You will get a string s which consisting of lowercase letters a-z, left parentheses '(' and right parentheses ')'. Your task is to remove as few parentheses as you can so that the parentheses in s is valid. You need to return a valid string.If the answer is correct it will prompt It is a correct answer. Because of the answer may be more than one, so you can return any of them. "()", "(())", "()()", "(())()" are valid parentheses strings, and ")(", "(()", "()()(", "()())" are not valid parentheses strings. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information A string without parentheses(such as：abcd) or a empty string "" is also a valid string. 0 ≤ 0≤ the length of s ≤ 1 0 5 ≤10 5 You can only remove parentheses, other operations will not be allowed. Example Example 1: Input: s = "a(b(c(de)fgh)" Output: "a(b(cde)fgh)" Explanation: There are 3 corrcect answers: "ab(c(de)fgh)"，"a(bc(de)fgh)"，"a(b(cde)fgh)"。 You can return any of them. Example 2: Input: s = "(((" Output: "" Explanation: A empty string "" is also a valid string. Tags Related Problems 263 Matching of parentheses Easy 1089 Valid Parenthesis String Medium 1721 Minimum Add to Make Parentheses Valid Medium Recommend Courses 简历/BQ/项目 面试软技能指导 FLAG高级工程师深度BQ辅导，简历打造+1V1模拟面试，反面试套路、高效上岸！ Problem Contributors contribute Thank the following users for their constructive comments on this problem ninechapter-kaga

## Explanation

This solution was accepted on LintCode using Java. The detected topics are PRE, please contact us via "Problem Correction", StackString, Stack, String, Test Data Test Output. Review the synced source file for the implementation details.
