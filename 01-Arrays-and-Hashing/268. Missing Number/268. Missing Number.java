1class Solution {
2    public int missingNumber(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<n;i++){
5            int s=1;
6            for(int j=0;j<n;j++){
7                if(i==nums[j]) 
8                {
9                    s=0;
10                    break;
11                }
12                
13            }
14            if(s==1)
15            {
16                return i;
17            }
18        }
19        return n;
20        
21    }
22}