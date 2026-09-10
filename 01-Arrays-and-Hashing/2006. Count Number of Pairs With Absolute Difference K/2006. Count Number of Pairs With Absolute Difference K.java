1class Solution {
2    public int countKDifference(int[] nums, int k) {
3        int count=0,n=nums.length;
4        for(int i=0;i<n;i++){
5            for(int j=i+1;j<n;j++){
6                if(Math.abs(nums[i]-nums[j]) == k) count++;
7            }
8        }
9        return count;
10        
11    }
12}