class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int k = n-1;
        int i = 0;
        while(i<k){
            int sum = numbers[i]+numbers[k];
            if(sum < target){
                i++;
            }
            else if(sum == target){
                return new int[]{i+1,k+1};
            }
            else k--;
        }
        return null;
    }
}