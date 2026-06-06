# Java Solution Using Stack :

- Platform: GeeksforGeeks
- Language: public Queue<Integer> rev(Queue<Integer> queue){ //add code here. Stack<Integer> stack = new Stack<>(); while(queue.size > 0) { stack.push(queue.poll()); } while(stack.size() > 0) { queue.add(stack.pop()); } return queue; }
- Difficulty: Unknown
- Topics: Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/queue-reversal/1
- Synced: 2026-06-06T11:50:24.221Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using public Queue<Integer> rev(Queue<Integer> queue){ //add code here. Stack<Integer> stack = new Stack<>(); while(queue.size > 0) { stack.push(queue.poll()); } while(stack.size() > 0) { queue.add(stack.pop()); } return queue; }. The detected topics are Stack. Review the synced source file for the implementation details.
