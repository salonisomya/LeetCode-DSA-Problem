class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length; 
        int s =0; 
        int l = n-1; 
        while(s<l){
            if(numbers[s]+numbers[l]== target){
                return new int[]{s+1,l+1};
            }
            else if(numbers[s]+numbers[l]>target){
                l--;
            }
            else s++;
        }
        return null;
    }
}