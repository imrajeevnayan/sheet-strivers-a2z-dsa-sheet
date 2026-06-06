# Reverse a Stack

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <stack> using namespace std; // function to insert element at the bottom of the stack void insertAtBottom(stack<int> &st, int x) { if (st.empty()) { st.push(x); return; } // hold the top element and remove it int top = st.top(); st.pop(); // recursively call to reach the bottom insertAtBottom(st, x); st.push(top); } // function to reverse the stack void reverseStack(stack<int> &st) { if (st.empty()) return; // hold the top element and remove it int top = st.top(); st.pop(); // reverse the remaining stack reverseStack(st); // insert the held element at the bottom insertAtBottom(st, top); } int main() { stack<int> st; st.push(1); st.push(2); st.push(3); st.push(4); reverseStack(st); while (!st.empty()) { cout << st.top() << " "; st.pop(); } return 0; }
- Difficulty: Unknown
- Topics: Reverse
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/reverse-a-stack/
- Synced: 2026-06-06T11:35:32.169Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <stack> using namespace std; // function to insert element at the bottom of the stack void insertAtBottom(stack<int> &st, int x) { if (st.empty()) { st.push(x); return; } // hold the top element and remove it int top = st.top(); st.pop(); // recursively call to reach the bottom insertAtBottom(st, x); st.push(top); } // function to reverse the stack void reverseStack(stack<int> &st) { if (st.empty()) return; // hold the top element and remove it int top = st.top(); st.pop(); // reverse the remaining stack reverseStack(st); // insert the held element at the bottom insertAtBottom(st, top); } int main() { stack<int> st; st.push(1); st.push(2); st.push(3); st.push(4); reverseStack(st); while (!st.empty()) { cout << st.top() << " "; st.pop(); } return 0; }. The detected topics are Reverse. Review the synced source file for the implementation details.
