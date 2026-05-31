# code in java

- Platform: GeeksforGeeks
- Language: class Solution { public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) { // code here int V = adj.size(); boolean[] visited = new boolean[V]; ArrayList<Integer> result = new ArrayList<>(); dfsHelper(0, adj, visited, result); return result; } private void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) { visited[node] = true; result.add(node); for (int neighbor : adj.get(node)) { if (!visited[neighbor]) { dfsHelper(neighbor, adj, visited, result); } } } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AccoliteAmazonSamsungIntuit, Company Tags, Accolite, Amazon, Samsung, Intuit, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
- Synced: 2026-05-31T12:13:37.973Z

## Problem Description

Given a connected undirected graph containing V vertices represented by a 2-d adjacency list adj[][], where each adj[i] represents the list of vertices connected to vertex i. Perform a Depth First Search (DFS) traversal starting from vertex 0, visiting vertices from left to right as per the given adjacency list, and return a list containing the DFS traversal of the graph. Note: Do traverse in the same order as they are in the given adjacency list. Examples: Input: adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]] Output: [0, 2, 4, 3, 1] Explanation: Starting from 0, the DFS traversal proceeds as follows: Visit 0 → Output: 0 Visit 2 (the first neighbor of 0) → Output: 0, 2 Visit 4 (the first neighbor of 2) → Output: 0, 2, 4 Backtrack to 2, then backtrack to 0, and visit 3 → Output: 0, 2, 4, 3 Finally, backtrack to 0 and visit 1 → Final Output: 0, 2, 4, 3, 1 Input: adj[][] = [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]] Output: [0, 1, 2, 3, 4] Explanation: Starting from 0, the DFS traversal proceeds as follows: Visit 0 → Output: 0 Visit 1 (the first neighbor of 0) → Output: 0, 1 Visit 2 (the first neighbor of 1) → Output: 0, 1, 2 Visit 3 (the first neighbor of 2) → Output: 0, 1, 2, 3 Backtrack to 2 and visit 4 → Final Output: 0, 1, 2, 3, 4 Constraints: 1 ≤ V = adj.size() ≤ 104 0 ≤ adj[i][j] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) { // code here int V = adj.size(); boolean[] visited = new boolean[V]; ArrayList<Integer> result = new ArrayList<>(); dfsHelper(0, adj, visited, result); return result; } private void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) { visited[node] = true; result.add(node); for (int neighbor : adj.get(node)) { if (!visited[neighbor]) { dfsHelper(neighbor, adj, visited, result); } } } }. The detected topics are Expected Complexities, Company Tags AccoliteAmazonSamsungIntuit, Company Tags, Accolite, Amazon, Samsung, Intuit, Topic Tags. Review the synced source file for the implementation details.
