# Learning data structure and algorithm. This is a problem how to create a Hash set from scratch! A standard method to implement is definitive not easy. But the constraint " 0 <= key <= 10^6" makes it much easier!!

- Platform: LeetCode
- Language: Problem List
- Difficulty: Easy
- Topics: Array, Hash Table, Linked List, Design, Hash Function
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/problems/design-hashset/
- Synced: 2026-05-30T17:06:43.172Z

## Problem Description

Design a HashSet without using any built-in hash table libraries. Implement MyHashSet class: void add(key) Inserts the value key into the HashSet. bool contains(key) Returns whether the value key exists in the HashSet or not. void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing. Example 1: Input ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"] [[], [1], [2], [1], [3], [2], [2], [2], [2]] Output [null, null, null, true, false, null, true, null, false] Explanation MyHashSet myHashSet = new MyHashSet(); myHashSet.add(1); // set = [1] myHashSet.add(2); // set = [1, 2] myHashSet.contains(1); // return True myHashSet.contains(3); // return False, (not found) myHashSet.add(2); // set = [1, 2] myHashSet.contains(2); // return True myHashSet.remove(2); // set = [1] myHashSet.contains(2); // return False, (already removed) Constraints: 0 <= key <= 106 At most 104 calls will be made to add, remove, and contains.

## Explanation

This solution was accepted on LeetCode using Problem List. The detected topics are Array, Hash Table, Linked List, Design, Hash Function. Review the synced source file for the implementation details.
