class Solution {
    public int maximumProduct(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[n-1]*nums[1]);
        
    }
}