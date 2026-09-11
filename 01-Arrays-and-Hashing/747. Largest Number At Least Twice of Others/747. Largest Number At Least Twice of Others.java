1class Solution {
2    public int dominantIndex(int[] nums) {
3        int max=nums[0];
4        int max_ind=0;
5        int n=nums.length;
6        for(int i=0;i<n;i++){
7            if(nums[i]>max){
8                max=nums[i];
9                max_ind=i;
10            }
11            
12        }
13         Arrays.sort(nums);
14            if(nums[n-1]>=2*nums[n-2]) return max_ind;
15            return-1;        
16    }
17}