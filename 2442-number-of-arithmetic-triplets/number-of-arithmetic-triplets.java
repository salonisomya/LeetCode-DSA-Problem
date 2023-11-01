class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        //int k=0;
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int z=j+1;z<nums.length;z++){
            if(nums[z]-nums[j]==diff && nums[j]-nums[i]==diff){
                    count++;
                }
            }
            
        }}
        return count;
    }
}