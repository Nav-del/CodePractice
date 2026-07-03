class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int fM = nums[nums.length - 1];
        int sM = nums[nums.length - 2];

        int result = (fM - 1)*(sM - 1);

        return result;
    }
}
