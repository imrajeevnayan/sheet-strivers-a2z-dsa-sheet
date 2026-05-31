# Platform: LintCode
# Problem: Course
# URL: https://www.lintcode.com/problem/365/description?showListFe=false&page=1&problemTypeId=4&pageSize=50
# Language: Python
# Difficulty: Unknown
# Topics: Binary, Microsoft, Test Data Commit Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-05-31T19:35:34.354Z

public·class·Solution·{
····public·int·countOnes(int·num)·{
········int·count·=·0;

········while·(num·!=·0)·{
············num·=·num·&·(num·-·1);
············count++;
········}

········return·count;
····}
}
