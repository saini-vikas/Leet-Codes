public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int curr_max = nums[0];
        int total_max = nums[0];
        for (int i=1; i<nums.length; i++){
            curr_max = Math.max(nums[i], nums[i]+curr_max);
            total_max = Math.max(curr_max, total_max);
        }
        return total_max;
    }
}
