# ENG

- Platform: LintCode
- Language: 1public class Solution { 2 public int minAddToMakeValid(String s) { 3 int left=0,right=0; 4 for(char c:s.toCharArray()){ 5 if(c=='(') left++; 6 else{ 7 if(left >0) left--; 8 else right++; 9 } 10 } 11 return left+right; 12 } 13}
- Difficulty: Easy
- Topics: StackGreedy, Stack, Greedy, Facebook, 2506 Remove the Invalid Parentheses Easy, Test Data Commit Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/1721/
- Synced: 2026-06-04T17:24:43.932Z

## Problem Description

Description Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid. Formally, a parentheses string is valid if and only if: It is the empty string, or It can be writte as AB (A concatenated with B), where A and B are valid strings, or It can be written as (A), where A is a valid string. Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information S.length <= 1000 S only consists of '(' and ')' characters. Example Example 1: Input: "())" Output: 1 Example 2: Input: "(((" Output: 3 Example 3: Input: "()" Output: 0 Example 4: Input: "()))((" Output: 4 Related Knowledge 学习《2024年10月北美大厂最新面试真题精讲》课程中的3.3Meta：最新面试精选002相关内容 ，了解更多相关知识！ Tags Company Facebook Related Problems 2506 Remove the Invalid Parentheses Easy Recommend Courses 0基础入门数据分析 进阶大厂刚需高薪人才，熟练掌握SQL、Python、Tableau、A/Btest等实用技能工具，配套100+数据题夯实基础

## Explanation

This solution was accepted on LintCode using 1public class Solution { 2 public int minAddToMakeValid(String s) { 3 int left=0,right=0; 4 for(char c:s.toCharArray()){ 5 if(c=='(') left++; 6 else{ 7 if(left >0) left--; 8 else right++; 9 } 10 } 11 return left+right; 12 } 13}. The detected topics are StackGreedy, Stack, Greedy, Facebook, 2506 Remove the Invalid Parentheses Easy, Test Data Commit Output. Review the synced source file for the implementation details.
