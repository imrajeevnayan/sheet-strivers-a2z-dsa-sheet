/*
 * Platform: CSES
 * Problem: Distinct Numbers
 * URL: https://cses.fi/problemset/result/17410054/
 * Language: Java
 * Difficulty: Unknown
 * Topics: TASK, RESULTS, ANALYSIS, STATISTICS, TESTS, QUEUE, SHARE CODE TO OTHERS, Distinct Numbers
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-03T09:16:42.450Z
 */

import java.io.*;
import java.util.*;
 
public class DistinctNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
 
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        HashSet<Integer> set = new HashSet<>();
 
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
 
        System.out.println(set.size());
    }
}
