class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // pointer for position of next non-zero element

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // swap nums[right] with nums[left]
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }
        }
    }
}