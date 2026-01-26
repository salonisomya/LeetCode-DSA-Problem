class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int one =0,two=0, three = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]==0)one++;
            else if(nums[i]==1) two++;
            else three++;
        }
        int idx =0;
        for(int i=0;i<one;i++){
            nums[idx++]=0;
        }
        for(int i=one;i<two+one;i++){
            nums[i]=1;
        }
        for(int i=two+one;i<n;i++){
            nums[i]=2;
        }
    }
}