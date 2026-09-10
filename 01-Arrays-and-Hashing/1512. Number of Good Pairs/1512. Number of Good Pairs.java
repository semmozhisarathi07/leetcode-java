1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int count=0;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                if (nums[i]==nums[j]) count++; 
8            }
9            
10        }
11        return count;
12        
13    }
14}