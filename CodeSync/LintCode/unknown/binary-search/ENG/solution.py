# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/159/
# Language: Python
# Difficulty: Unknown
# Topics: Binary Search, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-05-29T15:42:57.326Z

public·class·Solution·{
····public·int·findMin(int[]·nums)·{
········int·start=0,end=nums.length-1,ans=nums[0];
········while(start<=end){
············int·mid=start+(end-start)/2;
············if(nums[mid]>=nums[0])start=mid+1;
············else{
················ans=nums[mid];
················end=mid-1;
············}
········}
········return·ans;
····}
}
