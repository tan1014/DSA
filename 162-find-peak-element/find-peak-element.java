class Solution {
    // time:O(log n), n = number of elements in nums
    //space:O(1)

    public int findPeakElement(int[] nums) {
        
        // logic could be written in either ways: mid + 1(right) or mid - 1(left)

        // 1. nums[mid] > nums[mid + 1], compare with its right side
        // 2. nums[mid] > nums[mid - 1], compare with its left side


        // i  m     j           mid is smaller than right side 
        // 1  2  3  1           nums[mid] < nums[mid + 1] so i moves

        //       im j           mid is greater than right side
        // 1  2  3  1           nums[mid] > nums[mid + 1] so j moves

        //       ij             loop breaks
        // 1  2  3  1           


        int i = 0;
        int j = nums.length - 1;

        while(i < j) {
            int mid = i + (j - i)/2;

            if(nums[mid] < nums[mid + 1]) i = mid + 1;
            else if(nums[mid] > nums[mid + 1]) j = mid;
        }

        return i;
    }
}