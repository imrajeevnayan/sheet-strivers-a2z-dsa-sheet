# Binary Strings with Equal Sum of Two Halves

- Platform: GeeksforGeeks
- Language: #define ll long long class Solution { public: const int MOD=1e9+7; ll fact[100010]; void factorial(){ fact[0]=1; for(int i=1;i<100010;i++){ fact[i]=i*fact[i-1]%MOD; } return ; } ll binpow(int a,int x){ if(x==0)return 1; ll p=binpow(a,x/2); if((x&1)==0){ return (p*p)%MOD; } return (p*p%MOD)*a%MOD; } ll inverse(int a){ return binpow(a,MOD-2); } int computeValue(int n) { // code here factorial(); ll sum=0; for(int s=0;s<=n;s++){ ll ones=s,zeros=n-s; ll den=fact[ones]*fact[zeros]%MOD; ll inverse_den=inverse(den); // cout<<"den :"<<den<<", num : "<<fact[n]<<" , "; // cout<<"inverse den : "<<inverse_den<<" , "; ll perms=fact[n]*inverse_den%MOD; // cout<<"for sum : "<<s<<", permutations are : "<<perms<<endl; ll temp=(perms*perms)%MOD; sum=(sum+temp)%MOD; } return sum; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Algorithms, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-even-length1907/1
- Synced: 2026-06-13T16:12:05.794Z

## Problem Description

Given a number n, find count of all binary sequences of length 2n such that sum of first n bits is same as sum of last n bits. Note: Since the anwer can be very large, so return the answer modulo 109+7. Examples: Input: n = 2 Output: 6 Explanation: There are 6 sequences of length 2*n, the sequences are 0101, 0110, 1010, 1001, 0000 and 1111. Input: n = 1 Output: 2 Explanation: There are 2 sequence of length 2*n, the sequence are 00 and 11. Constraints: 1 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using #define ll long long class Solution { public: const int MOD=1e9+7; ll fact[100010]; void factorial(){ fact[0]=1; for(int i=1;i<100010;i++){ fact[i]=i*fact[i-1]%MOD; } return ; } ll binpow(int a,int x){ if(x==0)return 1; ll p=binpow(a,x/2); if((x&1)==0){ return (p*p)%MOD; } return (p*p%MOD)*a%MOD; } ll inverse(int a){ return binpow(a,MOD-2); } int computeValue(int n) { // code here factorial(); ll sum=0; for(int s=0;s<=n;s++){ ll ones=s,zeros=n-s; ll den=fact[ones]*fact[zeros]%MOD; ll inverse_den=inverse(den); // cout<<"den :"<<den<<", num : "<<fact[n]<<" , "; // cout<<"inverse den : "<<inverse_den<<" , "; ll perms=fact[n]*inverse_den%MOD; // cout<<"for sum : "<<s<<", permutations are : "<<perms<<endl; ll temp=(perms*perms)%MOD; sum=(sum+temp)%MOD; } return sum; } };. The detected topics are Expected Complexities, Topic Tags, Algorithms, Related Articles. Review the synced source file for the implementation details.
