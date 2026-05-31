/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/1174/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Simulation, Bloomberg, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-05-31T19:09:51.753Z
 */

········char[]·arr·=·String.valueOf(n).toCharArray();

········int·i·=·arr.length·-·2;
········while·(i·>=·0·&&·arr[i]·>=·arr[i·+·1])·{
············i--;
········}
········if·(i·<·0)·return·-1;

········int·j·=·arr.length·-·1;
········while·(arr[j]·<=·arr[i])·{
············j--;
········}
········swap(arr,·i,·j);
········reverse(arr,·i·+·1,·arr.length·-·1);

········long·ans·=·Long.parseLong(new·String(arr));

········return·(ans·>·Integer.MAX_VALUE)·?·-1·:·(int)·ans;
····}

····private·void·swap(char[]·arr,·int·i,·int·j)·{
········char·temp·=·arr[i];
········arr[i]·=·arr[j];
········arr[j]·=·temp;
····}

····private·void·reverse(char[]·arr,·int·l,·int·r)·{
········while·(l·<·r)·{
············swap(arr,·l++,·r--);
········}
····}
}
