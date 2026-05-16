class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double ans = Double.NEGATIVE_INFINITY;
        for(int i =0;i<=n-k;i++){
            int j = i+k;
            int sum = 0;
            int temp = i;
            while(temp < j){
                sum = sum + (nums[temp]);
                temp++;
            }
            double avg = (double)(sum)/k;
            if(avg>ans)
            ans = avg;
        }
        return ans;
    }
}