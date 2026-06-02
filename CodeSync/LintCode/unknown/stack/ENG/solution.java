/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/495/?showListFe=true&page=1&problemTypeId=4&tagIds=361&ordering=level&pageSize=50
 * Language: Java
 * Difficulty: Unknown
 * Topics: Stack, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-02T18:18:48.372Z
 */

public·class·Stack·{

····int[]·arr;
····int·top;
····int·capacity;

····public·Stack(int·size)·{
········capacity·=·size;
········arr·=·new·int[size];
········top·=·-1;
····}

····public·void·push(int·x)·{
········if·(top·==·capacity·-·1)·return;
········arr[++top]·=·x;
····}

····public·void·pop()·{
········if·(top·==·-1)·return;
········top--;
····}

····public·int·top()·{
········if·(top·==·-1)·return·-1;
········return·arr[top];
····}

····public·boolean·isEmpty()·{
········return·top·==·-1;
····}
}
