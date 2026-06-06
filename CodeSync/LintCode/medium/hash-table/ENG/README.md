# ENG

- Platform: LintCode
- Language: 1public class Solution { 2 public boolean containsNearbyDuplicate(int[] nums, int k) { 3 Map<Integer,Integer>map=new HashMap<>(); 4 for(int i=0;i<nums.length;i++){ 5 if(map.containsKey(nums[i])){ 6 int prevIdx=map.get(nums[i]); 7 if(i-prevIdx <=k)return true; 8 } 9 map.put(nums[i],i); 10 } 11 return false; 12 } 13}
- Difficulty: Medium
- Topics: Hash Table, Palantir Technologies Palantir Airbnb, Palantir Technologies, Palantir, Airbnb, Test Data Commit Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/1319/
- Synced: 2026-06-06T07:43:42.923Z

## Problem Description

Description Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information Example Example 1： Input：nums = [1,2,1], k = 0 Output：False Example 2： Input：nums = [1,2,1], k = 2 Output：True Explanation：nums[0] = nums[2] and 2 - 0 <= 2 Related Knowledge 学习《2024年7月北美大厂最新面试真题精讲》课程中的3.9Meta：最新面试精选005相关内容 ，了解更多相关知识！ Tags Company Palantir Technologies Palantir Airbnb Related Problems 1318 Contains Duplicate III Medium 1320 Contains Duplicate Easy Recommend Courses 系统设计 System Design 2024版 数据库、API、GFS、视频流等16大系统设计详解，实战练习拿下面试/晋升“拦路虎”

## Explanation

This solution was accepted on LintCode using 1public class Solution { 2 public boolean containsNearbyDuplicate(int[] nums, int k) { 3 Map<Integer,Integer>map=new HashMap<>(); 4 for(int i=0;i<nums.length;i++){ 5 if(map.containsKey(nums[i])){ 6 int prevIdx=map.get(nums[i]); 7 if(i-prevIdx <=k)return true; 8 } 9 map.put(nums[i],i); 10 } 11 return false; 12 } 13}. The detected topics are Hash Table, Palantir Technologies Palantir Airbnb, Palantir Technologies, Palantir, Airbnb, Test Data Commit Output. Review the synced source file for the implementation details.
