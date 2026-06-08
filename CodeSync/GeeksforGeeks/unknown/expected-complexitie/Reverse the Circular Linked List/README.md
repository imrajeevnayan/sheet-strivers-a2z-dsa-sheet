# Reverse the Circular Linked List

- Platform: GeeksforGeeks
- Language: /* class Node { int data; Node next; Node(int x) { data = x; next = null; } } */ class Solution { public Node reverseCircular(Node head) { ArrayList<Integer> list = new ArrayList<>(); Node curr = head; do { list.add(curr.data); curr = curr.next; } while (curr != head); //O(N) Collections.reverse(list); // O(N) Node newHead = new Node(list.get(0)); Node temp = newHead; for (int i = 1; i < list.size(); i++) { temp.next = new Node(list.get(i)); temp = temp.next; //O(N) } // Step 4: Make it circular temp.next = newHead; return newHead; //TC : O(N) // SC : O(N) } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, circular linked list, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-the-circular-linked-list/1
- Synced: 2026-06-08T11:58:10.154Z

## Problem Description

You are given a Circular Linked List. Reverse the given circular linked list changing the links between the nodes. Note: You don't have to print anything, just return the head of the modified list in each function. Nodes may consist of Duplicate values. Examples: Input: Output: 10 -> 8 -> 7 -> 1 Explanation: After reversing the given circular linked list, we'll get 10 -> 8 -> 7 -> 1. Input: Output: 10 -> 8 -> 7 -> 5 -> 2 Explanation: After reversing the given circular linked list, we'll receive 10 -> 8 -> 7 -> 5 -> 2. Constraints: 1 ≤ number of nodes ≤ 104 0 ≤ node -> data ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using /* class Node { int data; Node next; Node(int x) { data = x; next = null; } } */ class Solution { public Node reverseCircular(Node head) { ArrayList<Integer> list = new ArrayList<>(); Node curr = head; do { list.add(curr.data); curr = curr.next; } while (curr != head); //O(N) Collections.reverse(list); // O(N) Node newHead = new Node(list.get(0)); Node temp = newHead; for (int i = 1; i < list.size(); i++) { temp.next = new Node(list.get(i)); temp = temp.next; //O(N) } // Step 4: Make it circular temp.next = newHead; return newHead; //TC : O(N) // SC : O(N) } }. The detected topics are Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, circular linked list, Data Structures, Related Articles. Review the synced source file for the implementation details.
