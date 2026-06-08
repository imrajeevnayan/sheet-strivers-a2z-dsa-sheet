# ArrayList Separate Even Odd

- Platform: GeeksforGeeks
- Language: public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> numbers){ ArrayList<ArrayList<Integer>> combinedList = new ArrayList<>(); ArrayList<Integer> evenList = new ArrayList<>(); ArrayList<Integer> oddList = new ArrayList<>(); for(Integer number:numbers) { if(number%2 == 0) { evenList.add(number); } else { oddList.add(number); } } combinedList.add(evenList); combinedList.add(oddList); return combinedList; }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/arraylist-separate-even-odd--141628/1
- Synced: 2026-06-08T12:01:22.272Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> numbers){ ArrayList<ArrayList<Integer>> combinedList = new ArrayList<>(); ArrayList<Integer> evenList = new ArrayList<>(); ArrayList<Integer> oddList = new ArrayList<>(); for(Integer number:numbers) { if(number%2 == 0) { evenList.add(number); } else { oddList.add(number); } } combinedList.add(evenList); combinedList.add(oddList); return combinedList; }. Review the synced source file for the implementation details.
