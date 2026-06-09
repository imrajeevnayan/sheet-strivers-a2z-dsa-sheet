/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/65/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Binary Search, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T18:23:10.337Z
 */

public·class·Solution·{
····public·double·findMedianSortedArrays(int[]·a,·int[]·b)·{
········int·n1=a.length,n2=b.length;
········int·merge[]=new·int[n1+n2];
········int·i=0,j=0,k=0;
········while(i·<·n1·&&·j<·n2){
············if(a[i]<·b[j])merge[k++]=a[i++];
············else·merge[k++]=b[j++];
········}
········while(i<·n1)merge[k++]=a[i++];
········while(j<n2)merge[k++]=b[j++];
········int·n=merge.length;
········if(n%2==1)return·merge[n/2];
········else·return(merge[n/2]+merge[(n/2)-1])/2.0;
····}
}
