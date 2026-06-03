/*
 * Platform: CSES
 * Problem: Apartments
 * URL: https://cses.fi/problemset/result/17410379/
 * Language: Java
 * Difficulty: Unknown
 * Topics: TASK, RESULTS, ANALYSIS, STATISTICS, TESTS, QUEUE, SHARE CODE TO OTHERS, Distinct Numbers
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-03T09:40:39.718Z
 */

import java.io.*;
import java.util.*;
 
public class Apartments {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
 
        int[] applicants = new int[n];
        int[] apartments = new int[m];
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            applicants[i] = Integer.parseInt(st.nextToken());
        }
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            apartments[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(applicants);
        Arrays.sort(apartments);
 
        int count = 0;
        int i = 0, j = 0;
 
        while (i < n && j < m) {
            if (Math.abs(applicants[i] - apartments[j]) <= k) {
                count++;
                i++;
                j++;
            } else if (applicants[i] < apartments[j] - k) {
                i++;
            } else {
                j++;
            }
        }
 
        System.out.println(count);
    }
}
