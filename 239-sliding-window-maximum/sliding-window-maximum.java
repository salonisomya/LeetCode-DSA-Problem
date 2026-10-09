class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        while (r < n) {

            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() < l) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] < nums[r]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(r);

            if (r - l + 1 == k) {
                // Front contains the maximum element's index
                list.add(nums[deque.peekFirst()]);
                l++;
            }

            r++;
        }

        // Convert List<Integer> to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}