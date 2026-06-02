/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/495/?showListFe=true&page=1&problemTypeId=4&tagIds=361&ordering=level&pageSize=50
 * Language: Java
 * Difficulty: Unknown
 * Topics: Stack, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-02T18:19:00.020Z
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
