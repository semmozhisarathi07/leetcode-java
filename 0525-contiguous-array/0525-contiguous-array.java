class Solution {
    public int findMaxLength(int[] nums) {
        //changing zeros to -1
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0) nums[j]=-1;
        }
        int sum=0;
        int maximum=0;
        Map <Integer,Integer>map =new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                int last=map.get(sum);
                maximum=Math.max(maximum,i-last);

            }
            else{
                map.put(sum,i);
            }

        }
        return maximum;
        
    }
}