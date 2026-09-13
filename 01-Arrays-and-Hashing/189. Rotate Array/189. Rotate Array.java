1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        k%=n;
5        rot(nums,0,n-1);
6        rot(nums,0,k-1);
7        rot(nums,k,n-1);
8        
9    }
10    public void rot(int a[],int s,int e){
11        while(s<e){
12                int t=a[s];
13                a[s]=a[e];
14                a[e]=t;
15                s++;
16                e--;
17            }
18        
19    }
20}