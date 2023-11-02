class Solution {
    public void rotate(int[] nums, int k) {

        int n= nums.length;
        k = k%n;
        
        reverse (nums,0 ,n-1);//reverse entire array
        reverse (nums ,0 ,k-1);//1st half
        reverse (nums ,k, n-1);//rest
     }   
     public static void reverse(int[] nums,int start,int end){
        while(end>start){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}