class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l= nums.length;
        int[] right=new int[l];
        int[] left=new int[l];
        int[] res=new int[l];
        left[0]=1;
        for(int i=1;i<l;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[l-1]=1;
        for(int i=l-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<l;i++){
            res[i]=right[i]*left[i];
        }
        return res;

        
    }
}